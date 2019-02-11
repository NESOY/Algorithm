package Codility;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

// First : correct 100 perform 66
public class GenomicRangeQuery {
	// DNA -> A, C, G, T
	// A,C,G,T 1,2,3,4
	// What is minimal impact factor nucleotides contained in a particular part of the given DNA sequence?
	// String N, M Queries,
	public int[] solution(String S, int[] P, int[] Q) {
		int length = Math.max(P.length, Q.length);
		int[] ans = new int[length];
		char[] array = S.toCharArray();

		List<DNAInfo> list = new ArrayList<>();
		list.add(null);
		list.add(new DNAInfo(1, S.length()));
		list.add(new DNAInfo(2, S.length()));
		list.add(new DNAInfo(3, S.length()));
		list.add(new DNAInfo(4, S.length()));

		IntStream.range(0, array.length)
				.forEach(index -> list.get(getIndex(array[index])).add(index));

		// find ans
		for(int i=0; i<length; i++){
			int from = P[i];
			int to = Q[i];


			// sub case
			for(DNAInfo item : list){
				if(!Objects.isNull(item) && item.isContain(from, to)) {
					ans[i] = item.key;
					break;
				}
			}
		}

		return ans;
	}

	private Integer getIndex(char ch){
		switch (ch){
			case 'A':
				return 1;
			case 'C':
				return 2;
			case 'G':
				return 3;
			case 'T':
				return 4;
		}
		return -1;
	}

}
class DNAInfo{
	int key;
	boolean[] list;
	int min = 10000000;
	int max = 0;

	public DNAInfo(int key, int length) {
		this.key = key;
		this.list = new boolean[length];
	}

	public void add(int index){
		list[index] = true;
		min = Math.min(index, min);
		max = Math.max(index, max);
	}

	public boolean isContain(int from, int to){
		if(to < min || from > max)
			return false;

		int newFrom = Math.max(from, min);
		int newTo = Math.min(to, max);

		for(int i=newFrom; i<=newTo; i++){
			if(list[i])
				return true;
		}

		return false;
	}
}