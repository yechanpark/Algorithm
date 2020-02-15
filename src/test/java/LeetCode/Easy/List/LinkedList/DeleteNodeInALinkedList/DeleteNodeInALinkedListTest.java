package LeetCode.Easy.List.LinkedList.DeleteNodeInALinkedList;

import LeetCode.Easy.List.LinkedList.LinkedListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeleteNodeInALinkedListTest {
    private DeleteNodeInALinkedList deleteNodeInALinkedList;

    @BeforeEach
    public void init() {
        this.deleteNodeInALinkedList = new DeleteNodeInALinkedList();
    }

    @Test
    public void sample1Test() {
        LinkedListNode l1 = new LinkedListNode(4);
        LinkedListNode l12 = new LinkedListNode(5);
        LinkedListNode l13 = new LinkedListNode(1);
        LinkedListNode l14 = new LinkedListNode(9);
        l1.next = l12;
        l12.next = l13;
        l13.next = l14;

        this.deleteNodeInALinkedList.solution(l12);
        LinkedListNode expected = new LinkedListNode(4);
        LinkedListNode l22 = new LinkedListNode(1);
        LinkedListNode l23 = new LinkedListNode(9);
        expected.next = l22;
        l22.next = l23;


        boolean result = true;
        while (expected.next != null) {
            if (expected.val != l1.val)
                result = false;
            expected = expected.next;
            l1 = l1.next;
        }
        assert (result);

    }

    @Test
    public void sample2Test() {
        LinkedListNode l1 = new LinkedListNode(4);
        LinkedListNode l12 = new LinkedListNode(5);
        LinkedListNode l13 = new LinkedListNode(1);
        LinkedListNode l14 = new LinkedListNode(9);
        l1.next = l12;
        l12.next = l13;
        l13.next = l14;

        this.deleteNodeInALinkedList.solution(l13);
        LinkedListNode expected = new LinkedListNode(4);
        LinkedListNode l22 = new LinkedListNode(5);
        LinkedListNode l23 = new LinkedListNode(9);
        expected.next = l22;
        l22.next = l23;


        boolean result = true;
        while (expected.next != null) {
            if (expected.val != l1.val)
                result = false;
            expected = expected.next;
            l1 = l1.next;
        }
        assert (result);

    }

}
