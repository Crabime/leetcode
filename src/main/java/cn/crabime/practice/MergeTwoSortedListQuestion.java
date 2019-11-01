package cn.crabime.practice;

/**
 * 合并两个有序链表为一个有序链表
 */
public class MergeTwoSortedListQuestion {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode dummyNode = new ListNode(0);
        ListNode cur = dummyNode;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }

        if (l1 != null) {
            cur.next = l1;
        } else {
            cur.next = l2;
        }

        return dummyNode.next;
    }
}
