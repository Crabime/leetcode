package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class RevertIntegerTest extends TestCase {

    @Test
    public void testReverse() {

        RevertInteger ri = new RevertInteger();
        int a = 1230;
        ri.reverse(a);
        a = -1230;
        ri.reverse(a);
        a = 1534236469;
        ri.reverse(a);
    }
}