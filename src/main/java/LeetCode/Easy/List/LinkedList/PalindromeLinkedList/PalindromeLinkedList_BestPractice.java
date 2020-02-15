package LeetCode.Easy.List.LinkedList.PalindromeLinkedList;

import LeetCode.Easy.List.LinkedList.LinkedListNode;

/**
 * 공식키워드 - Linked List, Two Pointers
 */

public class PalindromeLinkedList_BestPractice {
    public boolean solution(LinkedListNode head) {
        if (head == null || head.next == null)
            return true;

        // step 1. cut the original list to two halves
        LinkedListNode prev = null, slow = head, fast = head, l1 = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        // step 2. reverse the 2nd half
        LinkedListNode l2 = (fast == null) ? reverse(slow) : reverse(slow.next);

        // step 3. compare the new two halves
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val)
                return false;

            l1 = l1.next;
            l2 = l2.next;
        }

        return true;
    }

    // helper function: reverse a list
    LinkedListNode reverse(LinkedListNode head) {
        LinkedListNode prev = null, curr = head, next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}