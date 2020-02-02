package LeetCode.Easy.List.SinglyLinkedList.LinkedListCycle;

import LeetCode.Easy.List.SinglyLinkedList.SinglyLinkedListNode;

/**
 * Use two pointers, walker and runner.
 * walker moves step by step. runner moves two steps at time.
 * if the Linked List has a cycle walker and runner will meet at some point.
 */
public class LinkedListCycle_BestPractice {
    public boolean solution(SinglyLinkedListNode head) {
        if (head == null) return false;
        SinglyLinkedListNode walker = head;
        SinglyLinkedListNode runner = head;
        while (runner.next != null && runner.next.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if (walker == runner) return true;
        }
        return false;
    }
}