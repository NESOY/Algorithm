package Codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class PermMissingElem {
	public int solution(int[] A) {
		Set<Integer> queue = new HashSet<>();

		for(int i=1; i<= A.length; i++){
			queue.add(i); // Stream Convert Cost
		}
		for(int item : A){
			queue.remove(item); // Stream Convert Cost
		}

		if(queue.iterator().hasNext())
			return queue.iterator().next();
		return A.length+1;
	}

	// Correctness : 100
	// Performance : 60
	// O(N) or O(N * log(N))
	public int solution1(int[] A) {
		Set<Integer> queue = new HashSet<>();

		IntStream.rangeClosed(1, A.length).forEach(queue::add);
		Arrays.stream(A).forEach(queue::remove);

		if(queue.iterator().hasNext())
			return queue.iterator().next();
		return A.length+1;
	}
}
