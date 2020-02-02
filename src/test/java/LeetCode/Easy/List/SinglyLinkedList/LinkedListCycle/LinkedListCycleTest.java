package LeetCode.Easy.List.SinglyLinkedList.LinkedListCycle;

import LeetCode.Easy.List.SinglyLinkedList.SinglyLinkedListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListCycleTest {
    private LinkedListCycle linkedListCycle;

    @BeforeEach
    public void init() {
        this.linkedListCycle = new LinkedListCycle();
    }

    @Test
    public void sample1Test() {
        SinglyLinkedListNode head = new SinglyLinkedListNode(3);
        SinglyLinkedListNode l2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode l3 = new SinglyLinkedListNode(0);
        SinglyLinkedListNode l4 = new SinglyLinkedListNode(-4);
        head.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l2;

        boolean actual = linkedListCycle.solution(head);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        SinglyLinkedListNode head = new SinglyLinkedListNode(1);
        SinglyLinkedListNode l2 = new SinglyLinkedListNode(2);
        head.next = l2;
        l2.next = head;

        boolean actual = linkedListCycle.solution(head);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        SinglyLinkedListNode head = new SinglyLinkedListNode(1);

        boolean actual = linkedListCycle.solution(head);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}
