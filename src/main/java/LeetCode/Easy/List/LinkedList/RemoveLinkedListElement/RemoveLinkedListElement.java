package LeetCode.Easy.List.LinkedList.RemoveLinkedListElement;

import LeetCode.Easy.List.LinkedList.LinkedListNode;

/**
 * 키워드 - Linked List
 * <p>
 * Remove all elements from a linked list of integers that have value val.
 * <p>
 * Example:
 * <p>
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class RemoveLinkedListElement {
    public LinkedListNode solution(LinkedListNode head, int val) {
        // 현재 검사하는 노드가 null이면 그대로 리턴
        if (head == null) return null;

        // 빼야 하는 값이면 다음 노드를 리턴
        if (head.val == val) {
            return solution(head.next, val);
        }

        head.next = solution(head.next, val);

        return head;
    }
}