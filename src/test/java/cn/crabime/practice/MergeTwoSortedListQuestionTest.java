package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

public class MergeTwoSortedListQuestionTest extends TestCase {

    @Test
    public void testMergeTwoLists() {
        MergeTwoSortedListQuestion.ListNode lNode1 = new MergeTwoSortedListQuestion.ListNode(1);
        MergeTwoSortedListQuestion.ListNode lNode2 = new MergeTwoSortedListQuestion.ListNode(2);
        MergeTwoSortedListQuestion.ListNode lNode3 = new MergeTwoSortedListQuestion.ListNode(4);
        lNode1.next = lNode2;
        lNode2.next = lNode3;

        MergeTwoSortedListQuestion.ListNode rNode1 = new MergeTwoSortedListQuestion.ListNode(1);
        MergeTwoSortedListQuestion.ListNode rNode2 = new MergeTwoSortedListQuestion.ListNode(3);
        MergeTwoSortedListQuestion.ListNode rNode3 = new MergeTwoSortedListQuestion.ListNode(4);
        rNode1.next = rNode2;
        rNode2.next = rNode3;

        MergeTwoSortedListQuestion mergeTwoSortedListQuestion = new MergeTwoSortedListQuestion();
        MergeTwoSortedListQuestion.ListNode node = mergeTwoSortedListQuestion.mergeTwoLists(lNode1, rNode1);
        while (node.next != null) {
            System.out.println(node.val);
        }
    }
}