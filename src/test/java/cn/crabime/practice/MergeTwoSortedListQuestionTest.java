package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

public class MergeTwoSortedListQuestionTest extends TestCase {

    @Test
    public void testMergeTwoLists() {
        ListNode lNode1 = new ListNode(1);
        ListNode lNode2 = new ListNode(2);
        ListNode lNode3 = new ListNode(4);
        lNode1.next = lNode2;
        lNode2.next = lNode3;

        ListNode rNode1 = new ListNode(1);
        ListNode rNode2 = new ListNode(3);
        ListNode rNode3 = new ListNode(4);
        rNode1.next = rNode2;
        rNode2.next = rNode3;

        MergeTwoSortedListQuestion mergeTwoSortedListQuestion = new MergeTwoSortedListQuestion();
        ListNode node = mergeTwoSortedListQuestion.mergeTwoLists(lNode1, rNode1);
        while (node.next != null) {
            System.out.println(node.val);
        }
    }
}