package LeetCode.Easy.List.LinkedList.PalindromeLinkedList;

import LeetCode.Easy.List.LinkedList.LinkedListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeLinkedListTest {
    private PalindromeLinkedList palindromeLinkedList;

    @BeforeEach
    public void init() {
        this.palindromeLinkedList = new PalindromeLinkedList();
    }

    @Test
    public void sample1Test() {
        LinkedListNode l1 = new LinkedListNode(1);
        LinkedListNode l2 = new LinkedListNode(2);
        l1.next = l2;

        boolean condition = palindromeLinkedList.solution(l1);
        assertFalse(condition);
    }
    @Test
    public void sample2Test() {
        LinkedListNode l1 = new LinkedListNode(1);
        LinkedListNode l2 = new LinkedListNode(2);
        LinkedListNode l3 = new LinkedListNode(2);
        LinkedListNode l4 = new LinkedListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        boolean condition = palindromeLinkedList.solution(l1);
        assertTrue(condition);
    }

}
