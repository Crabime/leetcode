package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicateItemTest extends TestCase {

    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicateItem item = new RemoveDuplicateItem();
        int len = item.removeDuplicates(new int[] {0, 1, 1, 2});
        assertEquals(3, len);
        assertEquals(2, item.removeDuplicates(new int[]{0, 1, 1}));
        assertEquals(4, item.removeDuplicates(new int[]{-1, 1, 1, 2, 5}));

    }
}