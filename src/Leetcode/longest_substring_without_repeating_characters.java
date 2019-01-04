package Leetcode;

import java.util.HashMap;
import java.util.Map;

/*
# Ref : https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class longest_substring_without_repeating_characters {
	public int lengthOfLongestSubstring(String s) {
		int longestLength = 0;

		for(int i=0; i<s.length(); i++){
			Map<Character, Boolean> findMap = new HashMap<>();
			int length = 0;
			for(int j = i; j<s.length(); j++) {
				char key = s.charAt(i);
				if (findMap.containsKey(key)) {
					break;
				}
				findMap.put(key, true); // Improve Point : Save Past Index
				length++;
			}

			longestLength = Math.max(longestLength, length);
		}


		return longestLength;
	}


	public int lengthOfLongestSubstringTOWindow(String s) {
		int n = s.length(), ans = 0;
		Map<Character, Integer> map = new HashMap<>(); // current index of character
		// try to extend the range [i, j]
		for (int j = 0, i = 0; j < n; j++) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)), i);
			}
			ans = Math.max(ans, j - i + 1);
			map.put(s.charAt(j), j + 1);
		}
		return ans;
	}
}
