package Leetcode;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class test_two_sum {

	@Test
	public void target에_해당하는_Index배열을_얻을수있다(){
		two_sum solution = new two_sum();
		int[] nums = {2, 7, 9,15};
		int[] ans = {0, 1};

		System.out.println(Arrays.toString(solution.twoSum(nums, 9)));
		assertTrue(Arrays.equals(ans, solution.twoSum(nums, 9)));
	}

	@Test
	public void 중복되는_경우_target에_해당하는_첫번째_Index배열을_얻을수있다(){
		two_sum solution = new two_sum();
		int[] nums = {0, 9 , 2, 7, 0, 9};
		int[] ans = {0, 1};

		System.out.println(Arrays.toString(solution.twoSum(nums, 9)));
		assertTrue(Arrays.equals(ans, solution.twoSum(nums, 9)));
	}
}
