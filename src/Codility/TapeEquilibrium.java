package Codility;

import java.util.stream.IntStream;

public class TapeEquilibrium {
	// N 2~100000
	// -1000 ~ 1000
	// 0 < P < N
	public int solution(int[] A) {
		int size = A.length;
		int min = 2001; // Min value 설정 문제 Range가 ~1000 ~ 1000 사이니까 최대 2000

		int first = A[0];
		int second = 0;

		for(int index = 1; index<size; index++){
			second += A[index];
		}

		for(int index = 1; index<size; index++){
			int absSum = Math.abs(first-second);
			min = Math.min(min, absSum);
			first += A[index];
			second -= A[index];
		}

		return min;
	}

	public int solutionJava8(int[] A){
		int min = 2001; // Min value 설정 문제 Range가 ~1000 ~ 1000 사이니까 최대 2000
		int size = A.length;
		int first = A[0];
		int sum = IntStream.of(A).reduce( 0,(a, b) -> a + b);
		int second = sum - A[0];

		for(int index = 1; index<size; index++){
			int absSum = Math.abs(first-second);
			min = Math.min(min, absSum);
			first += A[index];
			second -= A[index];
		}

		return sum;
	}
}
