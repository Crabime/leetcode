package cn.crabime.practice;

/**
 * 合并两个有序链表为一个有序链表
 */
public class MergeTwoSortedListQuestion {

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = null;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        while (l1.next != null && l2.next != null) {
            if (l1.val < l2.val) {
                if (node == null) {
                    node = new ListNode(l1.val);
                } else {
                    node.next = new ListNode(l1.val);
                }
                l1 = l1.next;
            } else {
                if (node == null) {
                    node = new ListNode(l2.val);
                } else {
                    node.next = new ListNode(l2.val);
                }
                l2 = l2.next;
            }
        }

        while (l1.next != null) {
            node.next = l1;
            node = node.next;
            l1 = l1.next;
        }

        while (l2.next != null) {
            node.next = l2;
            node = node.next;
            l2 = l2.next;
        }
        return node;
    }

    void applyVal(ListNode node, ListNode nextOne) {
        while (node.next != null) {
            node = node.next;
        }
        node.next = nextOne;
    }
}
