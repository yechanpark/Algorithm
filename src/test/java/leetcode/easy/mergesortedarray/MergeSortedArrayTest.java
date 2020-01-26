package leetcode.easy.mergesortedarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortedArrayTest {
    private MergeSortedArray mergeSortedArray;

    @BeforeEach
    public void init() {
        this.mergeSortedArray = new MergeSortedArray();
    }

    @Test
    public void sample1Test() {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        mergeSortedArray.solution(nums1, m, nums2, n);
        int[] expected = { 1, 2, 2, 3, 5, 6 };
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void sample2Test() {
        int[] nums1 = { 0 };
        int m = 0;
        int[] nums2 = { 1 };
        int n = 1;
        mergeSortedArray.solution(nums1, m, nums2, n);
        int[] expected = { 1 };
        assertArrayEquals(expected, nums1);
    }


}
