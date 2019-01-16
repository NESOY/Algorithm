package Codility;

import java.util.Arrays;

public class CyclicRotation {
	public int[] solution(int[] A, int K) {
		int size = A.length;
		if(size == 0)
			return A;

		int cycle = K % size;
		int[] temp = new int[size];
		int[] back = Arrays.copyOfRange(A,0, size - cycle);
		int[] front = Arrays.copyOfRange(A,size - cycle, size);

		System.arraycopy(front, 0, temp, 0, front.length);
		System.arraycopy(back, 0, temp, front.length, back.length);

		return temp;
	}
}
