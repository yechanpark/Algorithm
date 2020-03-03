package Examples.Sorting.major.QuickSort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {
    private QuickSort quickSort;

    @BeforeEach
    public void init() {
        this.quickSort = new QuickSort();
    }

    @Test
    public void quickSort1Test() {
        int[] A = { 1 };
        quickSort.sort(A);
        int[] expected = { 1 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void quickSort2Test() {
        int[] A = { 1, 2 };
        quickSort.sort(A);
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void quickSort3Test() {
        int[] A = {};
        quickSort.sort(A);
        int[] expected = {};
        assertArrayEquals(expected, A);
    }

    @Test
    public void quickSort4Test() {
        int[] A = { 1, 6, 3, 5, 7, 8, 2};
        quickSort.sort(A);
        int[] expected = { 1, 2, 3, 5, 6, 7, 8 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void quickSort5Test() {
        int[] A = { 31, 37, 33, 21, 14, 39, 36, 28, 0, 57, 93 };
        quickSort.sort(A);
        int[] expected = { 0, 14, 21, 28, 31, 33, 36, 37, 39, 57, 93 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void quickSort6Test() {
        int[] A = { 0, 0, 0, 0, 0, 0, 0, 0 };
        quickSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 0, 0 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void quickSort7Test() {
        int[] A = { 0, 0, 0, 5, 0, 0, 0, 0 };
        quickSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 0, 5 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void quickSort8Test() {
        int[] A = { 0, 0, 0, 5, 0, 0, 0 };
        quickSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 5 };
        assertArrayEquals(expected, A);
    }

}

