package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxLenSequenceTest extends TestCase {

    @Test
    public void testLengthOfLongestSubstring() {
        MaxLenSequence sequence = new MaxLenSequence();
        sequence.formatResult("abcabcbb");
        sequence.formatResult("bbbbb");
        sequence.formatResult("pwwkew");
    }
}