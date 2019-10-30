package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

public class LongestPalindromeTest extends TestCase {

    @Test
    public void testLongestPalindrome() {
        LongestPalindrome palindrome = new LongestPalindrome();
        String result = palindrome.longestPalindrome("abcbacd");
        System.out.println(result);
    }

    @Test
    public void testLongestPalindromeLength() {
        LongestPalindrome palindrome = new LongestPalindrome();
        int len = palindrome.longestPalindromeLength("abccccdd");
        assertEquals(7, len);
        len = palindrome.longestPalindromeLength("tattarrattat");
        assertEquals(12, len);
    }

    @Test
    public void testIsIntegerPalindrome() {
        LongestPalindrome palindrome = new LongestPalindrome();
        assertTrue(palindrome.isIntegerPalindrome(121));
        assertFalse(palindrome.isIntegerPalindrome(-121));
        assertFalse(palindrome.isIntegerPalindrome(10));
    }
}