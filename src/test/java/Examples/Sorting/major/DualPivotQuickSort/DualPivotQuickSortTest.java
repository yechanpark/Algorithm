package Examples.Sorting.major.DualPivotQuickSort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DualPivotQuickSortTest {
    private DualPivotQuickSort dualPivotQuickSort;

    @BeforeEach
    public void init() {
        this.dualPivotQuickSort = new DualPivotQuickSort();
    }

    @Test
    public void dualPivotQuickSort1Test() {
        int[] A = { 1 };
        dualPivotQuickSort.sort(A);
        int[] expected = { 1 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void dualPivotQuickSort2Test() {
        int[] A = { 1, 2 };
        dualPivotQuickSort.sort(A);
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void dualPivotQuickSort3Test() {
        int[] A = {};
        dualPivotQuickSort.sort(A);
        int[] expected = {};
        assertArrayEquals(expected, A);
    }

    @Test
    public void dualPivotQuickSort4Test() {
        int[] A = { 1, 6, 3, 5, 7, 8, 2};
        dualPivotQuickSort.sort(A);
        int[] expected = { 1, 2, 3, 5, 6, 7, 8 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void dualPivotQuickSort5Test() {
        int[] A = { 31, 37, 33, 21, 14, 39, 36, 28, 0, 57, 93 };
        dualPivotQuickSort.sort(A);
        int[] expected = { 0, 14, 21, 28, 31, 33, 36, 37, 39, 57, 93 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void dualPivotQuickSort6Test() {
        int[] A = { 0, 0, 0, 0, 0, 0, 0, 0 };
        dualPivotQuickSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 0, 0 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void dualPivotQuickSort7Test() {
        int[] A = { 0, 0, 0, 5, 0, 0, 0, 0 };
        dualPivotQuickSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 0, 5 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void dualPivotQuickSort8Test() {
        int[] A = { 0, 0, 0, 5, 0, 0, 0 };
        dualPivotQuickSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 5 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void dualPivotQuickSort9Test() {
        int[] A = { 50, 51, 30, 20, 70, 80, 90, 100, 85, 60, 65 };
        dualPivotQuickSort.sort(A);
        int[] expected = { 20, 30, 50, 51, 60, 65, 70, 80, 85, 90, 100 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void dualPivotQuickSort10Test() {
        int[] A = { 24, 8, 42, 75, 29, 77, 38, 57 };
        dualPivotQuickSort.sort(A);
        int[] expected = { 8, 24, 29, 38, 42, 57, 75, 77 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void dualPivotQuickSort11Test() {
        int[] A = { 4, 2, 5, 3, 6, 10, 9, 8 };
        dualPivotQuickSort.sort(A);
        int[] expected = { 2, 3, 4, 5, 6, 8, 9, 10 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void dualPivotQuickSort12Test() {
        int[] A = { 1, 1, 2 };
        dualPivotQuickSort.sort(A);
        int[] expected = { 1, 1, 2 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void dualPivotQuickSort13Test() {
        int[] A = { 1, 2, 1 };
        dualPivotQuickSort.sort(A);
        int[] expected = { 1, 1, 2 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void dualPivotQuickSort14Test() {
        int[] A = { 2, 2, 1 };
        dualPivotQuickSort.sort(A);
        int[] expected = { 1, 2, 2 };
        assertArrayEquals(expected, A);
    }

}

