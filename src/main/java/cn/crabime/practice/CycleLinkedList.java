package cn.crabime.practice;

public class CycleLinkedList {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            // 无环情况
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            // 快者走两步
            fast = fast.next.next;
        }
        return true;
    }
}
