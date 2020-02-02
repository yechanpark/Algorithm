package LeetCode.Easy.List.LinkedListCycle;

import LeetCode.Easy.List.SinglyLinkedListNode;

/**
 * Given a linked list, determine if it has a cycle in it.
 * <p>
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 * <img src="circularlinkedlist.jpg" />
 * <p>
 * Example 2:
 * <p>
 * Input: head = [1,2], pos = 0
 * Output: true
 * Explanation: There is a cycle in the linked list, where tail connects to the first node.
 * <img src="circularlinkedlist_test2.jpg" />
 * <p>
 * Example 3:
 * <p>
 * Input: head = [1], pos = -1
 * Output: false
 * Explanation: There is no cycle in the linked list.
 * <img src="circularlinkedlist_test3.jpg" />
 * <p>
 * <p>
 * <p>
 * Follow up:
 * <p>
 * Can you solve it using O(1) (i.e. constant) memory?
 */
public class LinkedListCycle {
    public boolean solution(SinglyLinkedListNode head) {
        return true;
    }
}

/**
 * 키워드 - SinglyLinkedList
 */