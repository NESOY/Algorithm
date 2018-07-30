package INTRODUCTION_TO_ALGORITHMS;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import static INTRODUCTION_TO_ALGORITHMS.Sort.insert;

public class SortTest {
	private int[] array = {3, 5, 2, 8, 1};
	private int[] expected = {1, 2, 3, 5, 8};
	@Test
	public void insertTest(){
		int[] result = insert(array);
		Assert.assertTrue(Arrays.equals(expected, result));
	}
}
