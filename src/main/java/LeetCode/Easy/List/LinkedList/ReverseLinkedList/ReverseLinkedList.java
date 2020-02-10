package LeetCode.Easy.List.LinkedList.ReverseLinkedList;

import LeetCode.Easy.List.LinkedList.LinkedListNode;

/**
 * 키워드 - Linked List
 * <p>
 * Reverse a singly linked list.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 * <p>
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class ReverseLinkedList {
    private LinkedListNode startNode;
    private LinkedListNode endNode;

    public LinkedListNode solution(LinkedListNode head) {
        // 맨 처음 노드를 저장
        if (startNode == null) {
            startNode = head;
            if (startNode == null)
                return null;
        }

        // 다음 노드가 null인 경우 (마지막 노드인 경우)
        if (head.next == null) {
            // 마지막 노드를 저장
            endNode = head;
            // 마지막 노드를 반환
            return head;
        }

        // 다음 노드가 null이 아닌 경우
        LinkedListNode next = solution(head.next);

        // 다음 노드의 다음 노드를 자신으로 변경
        next.next = head;

        // 다음 노드의 다음 노드가 첫 번째 노드인 경우, 마지막 노드 반환
        if (next.next == startNode) {
            head.next = null;
            return endNode;
        }

        // head 반환
        return head;


    }
}