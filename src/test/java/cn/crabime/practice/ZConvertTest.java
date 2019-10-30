package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZConvertTest extends TestCase {

    @Test
    public void testConvert() {
        ZConvert zConvert = new ZConvert();
        String example = "LEETCODEISHIRING";
        zConvert.convert(example, 4);
        zConvert.convert(example, 3);
    }
}