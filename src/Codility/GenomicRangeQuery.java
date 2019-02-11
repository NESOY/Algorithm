package Codility;
// Second Ref : https://nachwon.github.io/GenomicRangeQuery/
// First : correct 100 perform 66
public class GenomicRangeQuery {
	// DNA -> A, C, G, T
	// A,C,G,T 1,2,3,4
	// What is minimal impact factor nucleotides contained in a particular part of the given DNA sequence?
	// String N, M Queries,
	public int[] solution(String S, int[] P, int[] Q) {
		int[][] prefix = new int[S.length()+1][4];
		char[] array = S.toCharArray();
		int[] ans = new int[P.length];
		int index = 1;

		for(char item : array){
			prefix[index] = prefix[index-1].clone();
			prefix[index++][getIndex(item)]++;
		}

		for(int i=0; i<Math.max(P.length, Q.length); i++) {
			int from = Q[i];
			int to = P[i];

			for(int j=0; j<4; j++){
				if(prefix[from+1][j] - prefix[to][j] != 0) {
					ans[i] = j+1;
					break;
				}
			}
		}

		return ans;
	}

	private int getIndex(char ch){
		switch (ch){
			case 'A':
				return 0;
			case 'C':
				return 1;
			case 'G':
				return 2;
			case 'T':
				return 3;
		}
		return -1;
	}

}
