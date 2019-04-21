package Programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class 리모트2 {
	public int solution(int[] people, int[] tshirts) {
		Arrays.sort(people);
		Arrays.sort(tshirts);

		// 빈번한 추가와 삭제가 발생
		List<Integer> peopleList = new LinkedList<>();
		for (int item : people) {
			peopleList.add(item);
		}

		// 빈번한 추가와 삭제가 발생
		List<Integer> tshirtList = new LinkedList<>();
		for (int item : tshirts) {
			tshirtList.add(item);
		}


		return getTShirts(tshirtList, peopleList);
	}

	public int getTShirts(List<Integer> tshirtList, List<Integer> peopleList) {
		int answer = 0;
		for (Integer item : tshirtList) {
			if (!peopleList.isEmpty() && peopleList.get(0) <= item) {
				answer++;
				// 빈번한 추가와 삭제가 발생
				peopleList.remove(0);
			}
		}
		return answer;
	}
}
