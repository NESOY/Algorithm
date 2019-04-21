package Programmers;

import java.util.ArrayList;
import java.util.List;

public class 리모트1 {

	public int solution(int n) {
		int answer = 0;

		List<Integer> prime = getPrime(n);

		// O(n*3)
		for (int i = 0; i < prime.size(); i++) {
			for (int j = i + 1; j < prime.size(); j++) {
				for (int k = j + 1; k < prime.size(); k++) {
					if (prime.get(i) + prime.get(j) + prime.get(k) == n) {
						answer++;
					}
				}
			}
		}

		return answer;
	}

	// 소수 구하는 복잡도가 더 중요하다고 판단
	// 에라토스테네스의 체를 활용하여 복잡도를 낮춤.
	public List<Integer> getPrime(int max) {
		List<Integer> primeList = new ArrayList<>();

		boolean[] prime = new boolean[max];

		// 반대로 사용하면 초기화 작업이 필요없음.
		for (int i = 2; i < max; i++)
			prime[i] = true;

		// 에라토스테네스의 체
		// O(N*2)
		for (int i = 2; i < max; i++)
			if (prime[i]) {
				for (int j = i; j * i < max; j++)
					prime[i * j] = false;
			}

		for (int i = 2; i < max; i++)
			if (prime[i])
				primeList.add(i);

		return primeList;
	}
}