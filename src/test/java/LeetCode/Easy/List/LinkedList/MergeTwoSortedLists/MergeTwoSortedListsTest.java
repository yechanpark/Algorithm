package LeetCode.Easy.List.LinkedList.MergeTwoSortedLists;

import LeetCode.Easy.List.LinkedList.LinkedListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedListsTest {
    private MergeTwoSortedLists mergeTwoSortedLists;

    @BeforeEach
    public void init() {
        this.mergeTwoSortedLists = new MergeTwoSortedLists();
    }

    @Test
    public void sample1Test() {
        LinkedListNode l1 = new LinkedListNode(1);
        LinkedListNode l12 = new LinkedListNode(2);
        LinkedListNode l13 = new LinkedListNode(4);
        l1.next = l12;
        l12.next = l13;

        LinkedListNode l2 = new LinkedListNode(1);
        LinkedListNode l22 = new LinkedListNode(3);
        LinkedListNode l23 = new LinkedListNode(4);
        l2.next = l22;
        l22.next = l23;

        LinkedListNode actual = mergeTwoSortedLists.solution(l1, l2);
        LinkedListNode expected = new LinkedListNode(1);
        LinkedListNode expected2 = new LinkedListNode(1);
        LinkedListNode expected3 = new LinkedListNode(2);
        LinkedListNode expected4 = new LinkedListNode(3);
        LinkedListNode expected5 = new LinkedListNode(4);
        LinkedListNode expected6 = new LinkedListNode(5);
        expected.next = expected2;
        expected2.next = expected3;
        expected3.next = expected4;
        expected4.next = expected5;
        expected5.next = expected6;

        boolean result = true;
        while (expected.next != null) {
            if (expected.val != actual.val)
                result = false;
            expected = expected.next;
            actual = actual.next;
        }
        assert (result);

    }


}
