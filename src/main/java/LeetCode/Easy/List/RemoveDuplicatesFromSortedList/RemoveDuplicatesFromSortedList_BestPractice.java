package LeetCode.Easy.List.RemoveDuplicatesFromSortedList;

import LeetCode.Easy.List.ListNode;

/**
 *
 */
public class RemoveDuplicatesFromSortedList_BestPractice {
    public ListNode solution(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            while ((cur.next != null) && (cur.val == cur.next.val)) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;

    }
}