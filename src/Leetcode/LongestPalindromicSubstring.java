package Leetcode;


/**
 * @see <a href="https://leetcode.com/problems/longest-palindromic-substring/description/">link</a>
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        String result = String.valueOf(chars[0]);
        if(chars.length == 1) {
            return result;
        }

        int maxIndex = s.length() - 1;
        for (int start = 0; start < s.length(); start++) {
            for (int end = maxIndex; end > start; end--) {
                if (chars[start] == chars[end]) {
                    if (isPalindrome(chars, start, end)) {
                        result = getMaxString(result, s.substring(start, end + 1));
                    }
                }
            }
        }

        return result;
    }

    public boolean isPalindrome(char[] chars, int start, int end) {
        int length = (end - start) + 1;
        int half = length / 2;
        for (int i = 0; i < half; i++) {
            if (chars[start + i] != chars[end - i]) {
                return false;
            }
        }
        return true;
    }

    public String getMaxString(String a, String b) {
        return a.length() >= b.length() ? a : b;
    }
}
