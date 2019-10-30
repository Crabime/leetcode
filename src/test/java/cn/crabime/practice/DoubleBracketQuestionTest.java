package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleBracketQuestionTest extends TestCase {

    @Test
    public void testIsValid() {
        DoubleBracketQuestion bracketQuestion = new DoubleBracketQuestion();
        assertTrue(bracketQuestion.isValid("{}"));
        assertTrue(bracketQuestion.isValid("()[]{}"));
        assertFalse(bracketQuestion.isValid("(]"));
        assertTrue(bracketQuestion.isValid("{[]}"));
        assertFalse(bracketQuestion.isValid("([)]"));
        assertFalse(bracketQuestion.isValid("[])"));
        assertTrue(bracketQuestion.isValid(""));
        assertTrue(bracketQuestion.isValid("(([]){})"));
    }
}