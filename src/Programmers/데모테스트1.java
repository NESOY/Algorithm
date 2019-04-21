package Programmers;

import java.util.ArrayList;
import java.util.List;

public class 데모테스트1 {
	public int[] solution(int[][] v) {
		int[] answer = new int[2];
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> arrayList2 = new ArrayList<>();

		for (int[] vertex : v) {
			if (arrayList.contains(vertex[0])) {
				arrayList.remove(Integer.valueOf(vertex[0]));
			} else {
				arrayList.add(vertex[0]);
			}
			if (arrayList2.contains(vertex[1])) {
				arrayList2.remove(Integer.valueOf(vertex[1]));
			} else {
				arrayList2.add(vertex[1]);
			}
		}

		answer[0] = arrayList.get(0);
		answer[1] = arrayList2.get(0);

		return answer;
	}
}
