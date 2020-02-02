package LeetCode.Easy.List.LinkedList.RemoveDuplicatesFromSortedList;

import LeetCode.Easy.List.LinkedList.LinkedListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedListTest {
    private RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList;

    @BeforeEach
    public void init() {
        this.removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
    }

    @Test
    public void sample1Test() {
        LinkedListNode l1 = new LinkedListNode(1);
        LinkedListNode l12 = new LinkedListNode(1);
        LinkedListNode l13 = new LinkedListNode(2);
        l1.next = l12;
        l12.next = l13;

        LinkedListNode actual = removeDuplicatesFromSortedList.solution(l1);
        LinkedListNode expected = new LinkedListNode(1);
        expected.next = new LinkedListNode(2);

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
        LinkedListNode l1 = new LinkedListNode(1);
        LinkedListNode l12 = new LinkedListNode(1);
        LinkedListNode l13 = new LinkedListNode(2);
        LinkedListNode l14 = new LinkedListNode(3);
        LinkedListNode l15 = new LinkedListNode(3);
        l1.next = l12;
        l12.next = l13;
        l13.next = l14;
        l14.next = l15;

        LinkedListNode actual = removeDuplicatesFromSortedList.solution(l1);
        LinkedListNode expected = new LinkedListNode(1);
        LinkedListNode expected2 = new LinkedListNode(2);
        LinkedListNode expected3 = new LinkedListNode(3);
        expected.next = expected2;
        expected2.next = expected3;

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
    public void sample3Test() {

        LinkedListNode actual = removeDuplicatesFromSortedList.solution(null);

        boolean result = true;
        if (actual != null) {
            result = false;
        }
        assert (result);
    }

    @Test
    public void sample4Test() {
        LinkedListNode l1 = new LinkedListNode(1);
        LinkedListNode l12 = new LinkedListNode(1);
        LinkedListNode l13 = new LinkedListNode(1);
        l1.next = l12;
        l12.next = l13;

        LinkedListNode actual = removeDuplicatesFromSortedList.solution(l1);
        LinkedListNode expected = new LinkedListNode(1);

        if (actual.next != null)
            assert (false);
    }

}
