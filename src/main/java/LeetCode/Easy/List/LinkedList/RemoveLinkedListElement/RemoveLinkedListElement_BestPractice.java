package LeetCode.Easy.List.LinkedList.RemoveLinkedListElement;

import LeetCode.Easy.List.LinkedList.LinkedListNode;

/**
 * 공식키워드 - Linked List
 */
public class RemoveLinkedListElement_BestPractice {
    public LinkedListNode solution(LinkedListNode head, int val) {
        if (head == null) return null;
        head.next = solution(head.next, val);
        return head.val == val ? head.next : head;
    }
}