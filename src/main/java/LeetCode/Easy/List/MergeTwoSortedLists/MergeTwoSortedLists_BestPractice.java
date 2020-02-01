package LeetCode.Easy.List.MergeTwoSortedLists;

import LeetCode.Easy.List.ListNode;

/**
 *
 */
public class MergeTwoSortedLists_BestPractice {
    public ListNode solution(ListNode l1, ListNode l2) {
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