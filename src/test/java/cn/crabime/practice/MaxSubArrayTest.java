package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSubArrayTest extends TestCase {

    @Test
    public void testMaxSubArray() {
        MaxSubArray maxSubArray = new MaxSubArray();
        assertEquals(6, maxSubArray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
        assertEquals(8, maxSubArray.maxSubArray(new int[] {-2,5,-3,4,0,2,-1,-5,4}));
    }


    @Test
    public void testMaxSubArrayFastest() {
        MaxSubArray maxSubArray = new MaxSubArray();
        assertEquals(6, maxSubArray.maxSubArrayFastest(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }
}