package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWorldQuestionTest extends TestCase {

    @Test
    public void testLengthOfLastWord() {
        LengthOfLastWorldQuestion lengthOfLastWorldQuestion = new LengthOfLastWorldQuestion();
        assertEquals(5, lengthOfLastWorldQuestion.lengthOfLastWord("hello world"));
        assertEquals(5, lengthOfLastWorldQuestion.lengthOfLastWord("hello world "));
        assertEquals(3, lengthOfLastWorldQuestion.lengthOfLastWord("hello wo rld   "));
        assertEquals(1, lengthOfLastWorldQuestion.lengthOfLastWord("a"));
    }
}