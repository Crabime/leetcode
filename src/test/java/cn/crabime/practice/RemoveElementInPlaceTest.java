package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElementInPlaceTest extends TestCase {

    @Test
    public void testRemoveElement() {
        RemoveElementInPlace inPlace = new RemoveElementInPlace();
        assertEquals(5, inPlace.removeElement(new int[] {0,1,2,2,3,0,4,2}, 2));
        assertEquals(2, inPlace.removeElement(new int[] {3,2,2,3}, 2));
    }
}