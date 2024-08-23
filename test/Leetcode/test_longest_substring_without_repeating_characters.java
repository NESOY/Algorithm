package Leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class test_longest_substring_without_repeating_characters {
	@Test
	public void 가장_긴_문자열이_하나의_문자열인_경우_1을_반환한다(){
		longest_substring_without_repeating_characters solution = new longest_substring_without_repeating_characters();
		String input = "bbbbbb";

		int result = solution.lengthOfLongestSubstring(input);

		assertEquals(1, result);
	}

	@Test
	public void 가장_긴_문자열이_두개의_문자열인_경우_2을_반환한다(){
		longest_substring_without_repeating_characters solution = new longest_substring_without_repeating_characters();
		String input = "abababababab";

		int result = solution.lengthOfLongestSubstring(input);

		assertEquals(2, result);
	}

	@Test
	public void example_test(){
		longest_substring_without_repeating_characters solution = new longest_substring_without_repeating_characters();
		String input = "pwwkew";

		int result = solution.lengthOfLongestSubstring(input);

		assertEquals(3, result);
	}

	@Test
	public void example_test2(){
		longest_substring_without_repeating_characters solution = new longest_substring_without_repeating_characters();
		String input = "";

		int result = solution.lengthOfLongestSubstring(input);

		assertEquals(0, result);
	}

	@Test
	public void example_test3(){
		longest_substring_without_repeating_characters solution = new longest_substring_without_repeating_characters();
		String input = " ";

		int result = solution.lengthOfLongestSubstring(input);

		assertEquals(1, result);
	}

	@Test
	public void example_test4(){
		longest_substring_without_repeating_characters solution = new longest_substring_without_repeating_characters();
		String input = "abcdefg";

		int result = solution.lengthOfLongestSubstring(input);

		assertEquals(7, result);
	}

	@Test
	public void example_test5(){
		longest_substring_without_repeating_characters solution = new longest_substring_without_repeating_characters();
		String input = "dvdf";

		int result = solution.lengthOfLongestSubstring(input);

		assertEquals(3, result);
	}
}
