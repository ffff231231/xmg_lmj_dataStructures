package 链表;

/**
 * https://leetcode.cn/problems/reverse-linked-list/
 */
public class _206_反转链表 {
    // 使用递归
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    // 使用非递归（即使用迭代）
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newNode = null;
        while(head != null) {
            ListNode tmp = head.next;
            head.next = newNode;
            newNode = head;
            head = tmp;
        }

        return newNode;
    }
}
