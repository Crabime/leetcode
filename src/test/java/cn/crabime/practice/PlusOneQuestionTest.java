package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOneQuestionTest extends TestCase {

    @Test
    public void testPlusOne() {

        PlusOneQuestion plusOneQuestion = new PlusOneQuestion();
        assertEquals(2, plusOneQuestion.plusOne(new int[] {1, 9})[0]);
        assertEquals(1, plusOneQuestion.plusOne(new int[] {9, 9})[0]);
        assertEquals(1, plusOneQuestion.plusOne(new int[] {1, 2, 4})[0]);
        assertEquals(1, plusOneQuestion.plusOne(new int[] {9})[0]);
    }
}