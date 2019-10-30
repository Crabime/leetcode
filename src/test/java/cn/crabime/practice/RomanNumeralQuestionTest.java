package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralQuestionTest extends TestCase {

    @Test
    public void testConvert() {
        RomanNumeralQuestion romanNumeralQuestion = new RomanNumeralQuestion();
        String str = "IIV";
        assertEquals(3, romanNumeralQuestion.convert(str));
        str = "VII";
        assertEquals(7, romanNumeralQuestion.convert(str));
        str = "MCMXCIV";
        assertEquals(1994, romanNumeralQuestion.convert(str));
    }
}