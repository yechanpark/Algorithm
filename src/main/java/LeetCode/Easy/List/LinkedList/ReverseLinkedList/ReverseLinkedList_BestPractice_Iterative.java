package LeetCode.Easy.List.LinkedList.ReverseLinkedList;

import LeetCode.Easy.List.LinkedList.LinkedListNode;

/**
 * 공식키워드 - Linked List
 * <p>
 * iterative solution
 */
public class ReverseLinkedList_BestPractice_Iterative {
    public LinkedListNode solution(LinkedListNode head) {
        LinkedListNode newHead = null;

        while (head != null) {
            LinkedListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }

        return newHead;
    }
}