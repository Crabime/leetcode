package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class MySqrtTest extends TestCase {

    @Test
    public void testMySqrt() {
        MySqrt mySqrt = new MySqrt();
        assertEquals(5, mySqrt.mySqrt(32));
        assertEquals(2, mySqrt.mySqrt(4));
        assertEquals(1, mySqrt.mySqrt(1));
        assertEquals(1, mySqrt.mySqrt(2));
        assertEquals(46339, mySqrt.mySqrt(2147395599));
        assertEquals(46340, mySqrt.mySqrt(2147395600));
        assertEquals(46340, mySqrt.mySqrt(2147483647));
    }

    @Test
    public void testMySqrtFastestWay() {
        MySqrt mySqrt = new MySqrt();
        assertEquals(5, mySqrt.mySqrtUsingBinaryMethod(32));
        assertEquals(2, mySqrt.mySqrtUsingBinaryMethod(4));
        assertEquals(1, mySqrt.mySqrtUsingBinaryMethod(1));
        assertEquals(1, mySqrt.mySqrtUsingBinaryMethod(2));
        assertEquals(46339, mySqrt.mySqrtUsingBinaryMethod(2147395599));
        assertEquals(46340, mySqrt.mySqrtUsingBinaryMethod(2147395600));
        assertEquals(46340, mySqrt.mySqrtUsingBinaryMethod(2147483647));
    }

}