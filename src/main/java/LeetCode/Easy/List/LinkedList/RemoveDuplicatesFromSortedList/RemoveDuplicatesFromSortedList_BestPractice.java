package LeetCode.Easy.List.LinkedList.RemoveDuplicatesFromSortedList;

import LeetCode.Easy.List.LinkedList.LinkedListNode;

/**
 *
 */
public class RemoveDuplicatesFromSortedList_BestPractice {
    public LinkedListNode solution(LinkedListNode head) {
        LinkedListNode cur = head;
        while (cur != null) {
            while ((cur.next != null) && (cur.val == cur.next.val)) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;

    }
}