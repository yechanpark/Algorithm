package Examples.Sorting.minor.SelectionSort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTest {
    private SelectionSort selectionSort;

    @BeforeEach
    public void init() {
        this.selectionSort = new SelectionSort();
    }

    @Test
    public void selectionSort1Test() {
        int[] A = { 1 };
        selectionSort.sort(A);
        int[] expected = { 1 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void selectionSort2Test() {
        int[] A = { 1, 2 };
        selectionSort.sort(A);
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void selectionSort3Test() {
        int[] A = {};
        selectionSort.sort(A);
        int[] expected = {};
        assertArrayEquals(expected, A);
    }

    @Test
    public void selectionSort4Test() {
        int[] A = { 1, 6, 3, 5, 7, 8, 2};
        selectionSort.sort(A);
        int[] expected = { 1, 2, 3, 5, 6, 7, 8 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void selectionSort5Test() {
        int[] A = { 31, 37, 33, 21, 14, 39, 36, 28, 0, 57, 93 };
        selectionSort.sort(A);
        int[] expected = { 0, 14, 21, 28, 31, 33, 36, 37, 39, 57, 93 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void selectionSort6Test() {
        int[] A = { 0, 0, 0, 0, 0, 0, 0, 0 };
        selectionSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 0, 0 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void selectionSort7Test() {
        int[] A = { 0, 0, 0, 5, 0, 0, 0, 0 };
        selectionSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 0, 5 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void selectionSort8Test() {
        int[] A = { 0, 0, 0, 5, 0, 0, 0 };
        selectionSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 5 };
        assertArrayEquals(expected, A);
    }

}

