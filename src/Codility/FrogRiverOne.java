package Codility;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
	// Requirement
	// Frog Position 0
	// Bank Position X+1
	// 문제 이해하기.. 개구리는 모든 낙엽이 떨어져야 넘어갈 수 있다.
	public int solution(int X, int[] A) {
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<A.length; i++){
			if(A[i] <= X){
				set.add(A[i]);
				if(set.size() == X)
					return i;
			}
		}

		return -1;
	}
}
