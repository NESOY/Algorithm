package Leetcode;

import java.util.HashMap;
import java.util.Map;

/*
# Ref : https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class longest_substring_without_repeating_characters {
	public int lengthOfLongestSubstring(String s) {
		char[] array = s.toCharArray();
		int longestLength = 0;

		for(int i=0; i<array.length; i++){
			Map<Character, Boolean> findMap = new HashMap<>();
			int length = 0;
			for(int j = i; j<array.length; j++) {
				char key = array[j];
				if (findMap.containsKey(key)) {
					break;
				}
				findMap.put(key, true);
				length++;
			}

			longestLength = longestLength > length ? longestLength : length;
		}


		return longestLength;
	}
}
