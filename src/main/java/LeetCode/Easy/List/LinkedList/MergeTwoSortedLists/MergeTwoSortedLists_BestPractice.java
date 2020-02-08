package LeetCode.Easy.List.LinkedList.MergeTwoSortedLists;

import LeetCode.Easy.List.LinkedList.LinkedListNode;

/**
 * 공식키워드 - Linked List
 */
public class MergeTwoSortedLists_BestPractice {
    public LinkedListNode solution(LinkedListNode l1, LinkedListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = solution(l1.next, l2);
            return l1;
        } else {
            l2.next = solution(l1, l2.next);
            return l2;
        }
    }
}