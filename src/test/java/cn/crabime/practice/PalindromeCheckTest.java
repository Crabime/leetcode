package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckTest extends TestCase {

    @Test
    public void testIgnoreSpecialCharacter() {
        String str = "A man, a plan, a canal: Panama";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c > 47 && c < 58) || (c > 64 && c < 91) || (c > 96 && c < 123)) {
                builder.append(c);
            }
        }
        System.out.println(builder);
    }

    @Test
    public void testIsPalindrome() {
        String str = "A man, a plan, a canal: Panama";
        PalindromeCheck check = new PalindromeCheck();
        assertTrue(check.isPalindrome(str));
    }

}