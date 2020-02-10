package LeetCode.Easy.List.LinkedList.ReverseLinkedList;

import LeetCode.Easy.List.LinkedList.LinkedListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseLinkedListTest {
    private ReverseLinkedList reverseLinkedList;

    @BeforeEach
    public void init() {
        this.reverseLinkedList = new ReverseLinkedList();
    }

    @Test
    public void sample1Test() {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode l2 = new LinkedListNode(2);
        LinkedListNode l3 = new LinkedListNode(3);
        LinkedListNode l4 = new LinkedListNode(4);
        LinkedListNode l5 = new LinkedListNode(5);
        head.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        LinkedListNode actual = reverseLinkedList.solution(head);
        LinkedListNode expected = new LinkedListNode(5);
        LinkedListNode expected2 = new LinkedListNode(4);
        LinkedListNode expected3 = new LinkedListNode(3);
        LinkedListNode expected4 = new LinkedListNode(2);
        LinkedListNode expected5 = new LinkedListNode(1);
        expected.next = expected2;
        expected2.next = expected3;
        expected3.next = expected4;
        expected4.next = expected5;

        boolean result = true;
        while (expected.next != null) {
            if (expected.val != actual.val)
                result = false;
            expected = expected.next;
            actual = actual.next;
        }
        assert (result);
    }

    @Test
    public void sample2Test() {
        assertNull(reverseLinkedList.solution(null));
    }

}
