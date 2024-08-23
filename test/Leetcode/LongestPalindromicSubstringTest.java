package Leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestPalindromicSubstringTest {

    @Test
    public void test() {
        LongestPalindromicSubstring test = new LongestPalindromicSubstring();
        assertEquals("bab", test.longestPalindrome("babad"));
        assertEquals("b", test.longestPalindrome("b"));
        assertEquals("aca", test.longestPalindrome("aaca"));
        assertEquals("aca", test.longestPalindrome("aacabdkacaa"));
    }
}