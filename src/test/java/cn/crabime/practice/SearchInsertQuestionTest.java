package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsertQuestionTest extends TestCase {

    @Test
    public void testSearchInsert() {
        SearchInsertQuestion question = new SearchInsertQuestion();
        assertEquals(2, question.searchInsert(new int[] {1,3,5,6}, 5));
        assertEquals(1, question.searchInsert(new int[] {1,3,5,6}, 2));
        assertEquals(4, question.searchInsert(new int[] {1,3,5,6}, 7));
        assertEquals(0, question.searchInsert(new int[] {1,3,5,6}, 0));
    }
}