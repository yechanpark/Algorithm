package LeetCode.Easy.List.MergeTwoSortedLists;

import LeetCode.Easy.List.ListNode;
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
        ListNode l1 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        l1.next = l12;
        l12.next = l13;

        ListNode l2 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l2.next = l22;
        l22.next = l23;

        ListNode actual = mergeTwoSortedLists.solution(l1, l2);
        ListNode expected = new ListNode(1);
        ListNode expected2 = new ListNode(1);
        ListNode expected3 = new ListNode(2);
        ListNode expected4 = new ListNode(3);
        ListNode expected5 = new ListNode(4);
        ListNode expected6 = new ListNode(5);
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
