package INTRODUCTION_TO_ALGORITHMS;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class SortTest {
	private int[] array = {3, 5, 2, 8, 1};
	private int[] expected = {1, 2, 3, 5, 8};
	@Test
	public void insertSort(){
		int[] result = InsertSort.sort(array);
		assertTrue(Arrays.equals(expected, result));
	}

	@Test
	public void mergeSort(){
		int[] result = InsertSort.sort(array);
		assertTrue(Arrays.equals(expected, result));
	}
}
