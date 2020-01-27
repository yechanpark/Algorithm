package LeetCode.Easy.List.RemoveDuplicatesFromSortedList;

import LeetCode.Easy.List.ListNode;
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
        ListNode l1 = new ListNode(1);
        ListNode l12 = new ListNode(1);
        ListNode l13 = new ListNode(2);
        l1.next = l12;
        l12.next = l13;

        ListNode actual = removeDuplicatesFromSortedList.solution(l1);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);

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
        ListNode l1 = new ListNode(1);
        ListNode l12 = new ListNode(1);
        ListNode l13 = new ListNode(2);
        ListNode l14 = new ListNode(3);
        ListNode l15 = new ListNode(3);
        l1.next = l12;
        l12.next = l13;
        l13.next = l14;
        l14.next = l15;

        ListNode actual = removeDuplicatesFromSortedList.solution(l1);
        ListNode expected = new ListNode(1);
        ListNode expected2 = new ListNode(2);
        ListNode expected3 = new ListNode(3);
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

        ListNode actual = removeDuplicatesFromSortedList.solution(null);

        boolean result = true;
        if (actual != null) {
            result = false;
        }
        assert (result);
    }

    @Test
    public void sample4Test() {
        ListNode l1 = new ListNode(1);
        ListNode l12 = new ListNode(1);
        ListNode l13 = new ListNode(1);
        l1.next = l12;
        l12.next = l13;

        ListNode actual = removeDuplicatesFromSortedList.solution(l1);
        ListNode expected = new ListNode(1);

        if (actual.next != null)
            assert (false);
    }

}
