package Codility;

public class MaxCounters {
	// new Cost 최대한 피하기
	// 최대한 중복 로직 제거하기
	// first
	// correct : 100, Performance : 60
	public int[] solution(int N, int[] A) {
		int[] ans = new int[N];

		int maxValue = 0;
		int sum = 0;
		for(int item : A){
			if(item >= 1 && item <= N) {
				ans[item - 1]++; // hit
				maxValue = Math.max(maxValue, ans[item-1]); // calculate maxValue
			}
			else if(item == N+1 && maxValue != 0) { // maxValue로 new int[] filter
				ans = new int[N]; // clear -> Memory :(
				sum += maxValue;
				maxValue = 0; // init maxValue
			}
		}

		for (int i = 0; i < ans.length; i++) {
			ans[i] += sum;
		}

		return ans;
	}
}
