package INTRODUCTION_TO_ALGORITHMS;

public class Sort {
	// Time Complexity :
	// Best : O(n)
	// Worst : O(n^2)
	// Space Complexity :
	// Worst : O(1)
	public static int[] insert(int[] array){
		for(int index=1; index<array.length; index++){
			int save = array[index];
			while(index>0 && array[index-1] > save){
				array[index] = array[index-1];
				index--;
			}
			array[index] = save;
		}
		return array;
	}
}
