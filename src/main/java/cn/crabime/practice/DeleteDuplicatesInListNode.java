package cn.crabime.practice;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
 */
public class DeleteDuplicatesInListNode {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        // 哑节点思路
        ListNode dummyNode = new ListNode(0);
        ListNode node = dummyNode;

        while (head.next != null) {
            if (head.val != head.next.val) {
                node.next = head;
                node = node.next;
            }
            head = head.next;
        }

        // 最后一个ListNode肯定没涵盖到
        node.next = head;
        return dummyNode.next;
    }
}
