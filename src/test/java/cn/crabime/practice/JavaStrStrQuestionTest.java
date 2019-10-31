package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class JavaStrStrQuestionTest extends TestCase {

    @Test
    public void testStrStr() {
        JavaStrStrQuestion strQuestion = new JavaStrStrQuestion();
        assertEquals(2, strQuestion.strStr("hello", "ll"));
        assertEquals(-1, strQuestion.strStr("aaaaa", "bba"));
        assertEquals(-1, strQuestion.strStr("aaa", "aaaa"));
        assertEquals(0, strQuestion.strStr("aaaa", "aaa"));

    }
}