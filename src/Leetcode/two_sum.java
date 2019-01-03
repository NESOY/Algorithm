package Leetcode;

import java.util.HashMap;
import java.util.Map;

/*
# Ref : https://leetcode.com/problems/two-sum/
 */
public class two_sum {

	/*
		@ Time Complexity : O(n^2)
		@ Space Complexity : O(1)
	 */
	public int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
		int size = nums.length;

		for(int firstIndex=0; firstIndex<size-1; firstIndex++) {
			for (int secondIndex = firstIndex + 1; secondIndex < size; secondIndex++) {
				if (target == nums[firstIndex] + nums[secondIndex]) {
					ans[0] = firstIndex;
					ans[1] = secondIndex;
					return ans;
				}
			}
		}

		return ans;
	}

	/*
		@ Time Complexity : O(n)
		@ Space Complexity : O(n)
	 */
	public int[] twoSum_MoreEffectiveSolution(int[] nums, int target){
		Map<Integer, Integer> map = new HashMap<>();

		for (int i=0; i<nums.length; i++){
			int key = target - nums[i];
			if(map.containsKey(key)){
				return new int[] {map.get(key), i};
			}
			map.put(nums[i], i);
		}

		throw new IllegalArgumentException("No two Sum Solution");
	}
}
