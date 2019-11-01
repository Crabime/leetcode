package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbStairsQuestionTest extends TestCase {

    @Test
    public void testClimbStairs() {

        ClimbStairsQuestion question = new ClimbStairsQuestion();
        assertEquals(3, question.climbStairs(3));
        assertEquals(5, question.climbStairs(4));
    }

    @Test
    public void testClimbStairsUsingDynamicProgramming() {
        ClimbStairsQuestion question = new ClimbStairsQuestion();
        assertEquals(3, question.climbStairsUsingDynamicProgramming(3));
        assertEquals(5, question.climbStairsUsingDynamicProgramming(4));
    }
}