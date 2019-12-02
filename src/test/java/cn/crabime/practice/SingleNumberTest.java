package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest extends TestCase {

    @Test
    public void testSingle() {
        SingleNumber singleNumber = new SingleNumber();
        assertEquals(4, singleNumber.single(new int[] {4, 2, 2}));
        assertEquals(1, singleNumber.single(new int[] {2, 2, 1}));
        assertEquals(1, singleNumber.single(new int[] {0, 0, 1}));
        assertEquals(0, singleNumber.single(new int[] {1, 0, 1}));
        assertEquals(0, singleNumber.single(new int[] {1, 1, 1, 1, 0, 1}));
    }

    @Test
    public void testSingle2() {
        SingleNumber singleNumber = new SingleNumber();
        assertEquals(4, singleNumber.single2(new int[] {4, -2, -2}));
    }
}