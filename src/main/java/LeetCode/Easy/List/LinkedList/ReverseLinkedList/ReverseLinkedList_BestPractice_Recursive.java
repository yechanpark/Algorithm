package LeetCode.Easy.List.LinkedList.ReverseLinkedList;

import LeetCode.Easy.List.LinkedList.LinkedListNode;

/**
 * 공식키워드 - Linked List
 * <p>
 * recursive solution
 */
public class ReverseLinkedList_BestPractice_Recursive {
    public LinkedListNode solution(LinkedListNode head) {
        return reverseListInt(head, null);
    }

    private LinkedListNode reverseListInt(LinkedListNode head, LinkedListNode newHead) {
        if (head == null) return newHead;
        LinkedListNode next = head.next;
        head.next = newHead;
        return reverseListInt(next, head);
    }
}