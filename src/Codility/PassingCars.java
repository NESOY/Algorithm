package Codility;

public class PassingCars {
	public int solution(int[] A) {
		int count = 0;
		int sum = 0;
		for(int index=A.length-1; index>=0; index--){
			if(A[index] == 1)
				count++;
			else if(A[index] == 0) {
				sum += count;
				if(sum > 1000000000)
					return -1;
			}
		}

		return sum;
	}
}
