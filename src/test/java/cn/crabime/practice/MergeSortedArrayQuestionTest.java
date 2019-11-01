package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortedArrayQuestionTest extends TestCase {

    @Test
    public void testMerge() {

        MergeSortedArrayQuestion mergeSortedArrayQuestion = new MergeSortedArrayQuestion();
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int[] nums2 = new int[] {2,5,6};
        mergeSortedArrayQuestion.merge(nums1, 3, nums2, nums2.length);
        assertArrayEquals(new int[] {1,2,2,3,5,6}, nums1);
    }
}