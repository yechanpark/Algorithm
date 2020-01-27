package LeetCode.Easy.List.RemoveDuplicatesFromSortedList;

import LeetCode.Easy.List.ListNode;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p>
 * Example 1:
 * <p>
 * Input: 1->1->2
 * Output: 1->2
 * Example 2:
 * <p>
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

public class RemoveDuplicatesFromSortedList {
    public ListNode solution(ListNode head) {

        // 현재 검사하는 노드가 null인 경우 null 리턴
        if (head == null) return null;

        // 다음 노드가 null이 아니면서 현재 노드와 다음 노드의 값이 같은 경우
        while ((head.next != null) && (head.val == head.next.val)) {
            // 다음 노드의 값을 다다음 노드로 변경 (중복이 안나올 때까지)
            head.next = head.next.next;
        }

        // 다음 노드의 중복을 검사 (현재노드와 무조건 다른 숫자를 가짐)
        solution(head.next);

        // 다음 노드의 중복을 정리했으면 현재 노드 리턴
        return head;

    }
}


/**
 * 키워드 -
 */