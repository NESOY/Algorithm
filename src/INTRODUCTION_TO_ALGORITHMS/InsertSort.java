package INTRODUCTION_TO_ALGORITHMS;

import java.util.Arrays;

public class InsertSort {
	// Time Complexity :
		// Best : O(n)
		// Worst : O(n^2)
	// Space Complexity :
		// Worst : O(1)
	public static int[] sort(int[] array){
		for(int index=1; index<array.length; index++){
			int save = array[index];
			int targetIndex = index - 1;
			while(targetIndex >= 0 && array[targetIndex] > save){
				array[targetIndex+1] = array[targetIndex];
				targetIndex--;
			}
			array[targetIndex+1] = save;
			System.out.println(Arrays.toString(array));
		}
		return array;
	}
}
