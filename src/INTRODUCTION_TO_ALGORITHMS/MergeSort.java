package INTRODUCTION_TO_ALGORITHMS;

public class MergeSort {
	public static void sort(int[] array, int start, int end){
		if( start < end){
			int halfIndex = start + end / 2;
			sort(array, start, halfIndex);
			sort(array, halfIndex+1, end);
		}

	}
}
