package Codility;

public class PermCheck {
	// HashSet은 내부적으로 HashMap을 사용한다.
	// HashSet은 순서보장이 되지 않는다. 65535를 넘어가게 되면?
	// >>> 16 비트이동과 XOR연산으로 Hash값이 순차적이 아니게 된다.
	// 순차적인 Set은 TreeSet을 사용하기.
	// Primitive Type -> Wrapper Class Cost가 높다. Parameter가 Primitive니 최대한 Primitive로 문제 해결하기
	public int solution(int[] A) {
		boolean[] flags = new boolean[A.length];
		int count = 1;

		for(int item : A){
			if(item > A.length) // find Over size item
				return 0;
			if(flags[item-1]) // find Duplicate
				return 0;
			flags[item-1] = true;
			count++;
		}

		return count == A.length+1 ? 1 : 0;
	}
}