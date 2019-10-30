package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest extends TestCase {

    @Test
    public void testLongestCommonPrefix() {
        LongestCommonPrefix commonPrefix = new LongestCommonPrefix();
        String[] strs = {"dog","racecar","car"};
        assertEquals("", commonPrefix.longestCommonPrefix(strs));
        String[] strs1 = {"flower","flow","flight"};
        assertEquals("fl", commonPrefix.longestCommonPrefix(strs1));
        String[] strs2 = {"",""};
        assertEquals("", commonPrefix.longestCommonPrefix(strs2));
        String[] strs3 = {"c","c"};
        assertEquals("c", commonPrefix.longestCommonPrefix(strs3));
    }
}