package LeetCode.Easy.List.LinkedList.RemoveLinkedListElement;

import LeetCode.Easy.List.LinkedList.LinkedListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveLinkedListElementTest {
    private RemoveLinkedListElement removeLinkedListElement;

    @BeforeEach
    public void init() {
        this.removeLinkedListElement = new RemoveLinkedListElement();
    }

    @Test
    public void sample1Test() {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode l2 = new LinkedListNode(2);
        LinkedListNode l3 = new LinkedListNode(6);
        LinkedListNode l4 = new LinkedListNode(3);
        LinkedListNode l5 = new LinkedListNode(4);
        LinkedListNode l6 = new LinkedListNode(5);
        LinkedListNode l7 = new LinkedListNode(6);
        head.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;

        int val = 6;

        LinkedListNode actual = removeLinkedListElement.solution(head, val);
        LinkedListNode expected = new LinkedListNode(1);
        LinkedListNode expected2 = new LinkedListNode(2);
        LinkedListNode expected3 = new LinkedListNode(3);
        LinkedListNode expected4 = new LinkedListNode(4);
        LinkedListNode expected5 = new LinkedListNode(5);
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
        LinkedListNode head = null;

        int val = 1;

        LinkedListNode actual = removeLinkedListElement.solution(head, val);
        LinkedListNode expected = null;

        assertEquals(actual, expected);
    }

    @Test
    public void sample3Test() {
        LinkedListNode head = new LinkedListNode(1);
        int val = 1;

        LinkedListNode actual = removeLinkedListElement.solution(head, val);
        LinkedListNode expected = null;

        assertEquals(actual, expected);
    }

    @Test
    public void sample4Test() {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode l2 = new LinkedListNode(1);
        head.next = l2;

        int val = 1;

        LinkedListNode actual = removeLinkedListElement.solution(head, val);
        LinkedListNode expected = null;

        assertEquals(actual, expected);
    }

}
