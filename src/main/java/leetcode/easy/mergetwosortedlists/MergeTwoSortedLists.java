package leetcode.easy.mergetwosortedlists;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

public class MergeTwoSortedLists {
    public ListNode solution(ListNode l1, ListNode l2) {
        // 임시로 사용될 노드, 현재 l2, l2의 값 중 가장 작은 노드를 가리킴
        // 리턴 시 이 노드는 상위 메서드의 next 노드가 됨. (상위 result 노드보다 더 큰 값)
        ListNode tempNode;

        // 둘 다 끝이면 null 리턴
        if (l1 == null && l2 == null)
            return null;

            // l1만 null인 경우
        else if (l1 == null) {
            // l2의 현재 노드를 임시 노드에 연결
            tempNode = l2;
            // l2의 현재 노드를 next로 옮김
            l2 = l2.next;
        }

        // l2만 null인 경우
        else if (l2 == null) {
            // l1의 현재 노드를 임시 노드에 연결
            tempNode = l1;
            // l1의 현재 노드를 next로 옮김
            l1 = l1.next;
        }

        // 둘다 null이 아닌 경우
        else {
            // 둘 중 큰 값을 가진 노드를 임시 노드에 연결
            if (l1.val >= l2.val) {
                tempNode = l2;
                l2 = l2.next;
            } else {
                tempNode = l1;
                l1 = l1.next;
            }
        }

        // 임시 노드의 다음 노드에 다시 l1, l2 중 최대값을 연결하도록 재귀호출 (오름차순 정렬)
        tempNode.next = solution(l1, l2);
        return tempNode;
    }
}

class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }
}

/**
 * 키워드 - LinkedList, 재귀호출(Recursive Call), 포인터계산
 */