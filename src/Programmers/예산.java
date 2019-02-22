package Programmers;

import java.util.Arrays;

public class 예산 {
	public int solution(int[] d, int budget) {
		int answer = 0;
		int sum = 0;

		Arrays.sort(d);

		for(int use : d){
			if(budget >= (sum + use)){
				sum += use;
				answer++;
			} else {
				break;
			}
		}

		return answer;
	}
}
