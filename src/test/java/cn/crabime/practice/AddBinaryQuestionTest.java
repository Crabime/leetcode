package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddBinaryQuestionTest extends TestCase {

    @Test
    public void testAddBinary() {
        AddBinaryQuestion binaryQuestion = new AddBinaryQuestion();
        assertEquals("11", binaryQuestion.addBinary("10", "01"));
        assertEquals("10101", binaryQuestion.addBinary("1010", "1011"));
        assertEquals("1101", binaryQuestion.addBinary("1010", "11"));
        assertEquals("1101", binaryQuestion.addBinary("1011", "10"));
        assertEquals("1100", binaryQuestion.addBinary("1001", "11"));
    }
}