package Codility;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
	// Duplicate
	public int solution(int[] A) {
		Set<Integer> set = new HashSet<>();
		for(int item : A){
			if(item > 0) {
				set.add(item); // Wrapping Cost
			}
		}

		int i=1;
		while(i<=100000) {
			if (!set.contains(i)) {
				return i;
			}
			i++;
		}

		return i;
	}
}
