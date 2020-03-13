package Examples.Sorting.major.MergeSort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {
    private MergeSort mergeSort;

    @BeforeEach
    public void init() {
        this.mergeSort = new MergeSort();
    }

    @Test
    public void mergeSort1Test() {
        int[] A = { 1 };
        mergeSort.sort(A);
        int[] expected = { 1 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void mergeSort2Test() {
        int[] A = { 1, 2 };
        mergeSort.sort(A);
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void mergeSort3Test() {
        int[] A = {};
        mergeSort.sort(A);
        int[] expected = {};
        assertArrayEquals(expected, A);
    }

    @Test
    public void mergeSort4Test() {
        int[] A = { 1, 6, 3, 5, 7, 8, 2};
        mergeSort.sort(A);
        int[] expected = { 1, 2, 3, 5, 6, 7, 8 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void mergeSort5Test() {
        int[] A = { 31, 37, 33, 21, 14, 39, 36, 28, 0, 57, 93 };
        mergeSort.sort(A);
        int[] expected = { 0, 14, 21, 28, 31, 33, 36, 37, 39, 57, 93 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void mergeSort6Test() {
        int[] A = { 0, 0, 0, 0, 0, 0, 0, 0 };
        mergeSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 0, 0 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void mergeSort7Test() {
        int[] A = { 0, 0, 0, 5, 0, 0, 0, 0 };
        mergeSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 0, 5 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void mergeSort8Test() {
        int[] A = { 0, 0, 0, 5, 0, 0, 0 };
        mergeSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 5 };
        assertArrayEquals(expected, A);
    }

}

