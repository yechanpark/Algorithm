package Examples.Sorting.minor.InsertionSort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {
    private InsertionSort insertionSort;

    @BeforeEach
    public void init() {
        this.insertionSort = new InsertionSort();
    }

    @Test
    public void insertionSort1Test() {
        int[] A = { 1 };
        insertionSort.sort(A);
        int[] expected = { 1 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void insertionSort2Test() {
        int[] A = { 1, 2 };
        insertionSort.sort(A);
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void insertionSort3Test() {
        int[] A = {};
        insertionSort.sort(A);
        int[] expected = {};
        assertArrayEquals(expected, A);
    }

    @Test
    public void insertionSort4Test() {
        int[] A = { 1, 6, 3, 5, 7, 8, 2};
        insertionSort.sort(A);
        int[] expected = { 1, 2, 3, 5, 6, 7, 8 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void insertionSort5Test() {
        int[] A = { 31, 37, 33, 21, 14, 39, 36, 28, 0, 57, 93 };
        insertionSort.sort(A);
        int[] expected = { 0, 14, 21, 28, 31, 33, 36, 37, 39, 57, 93 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void insertionSort6Test() {
        int[] A = { 0, 0, 0, 0, 0, 0, 0, 0 };
        insertionSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 0, 0 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void insertionSort7Test() {
        int[] A = { 0, 0, 0, 5, 0, 0, 0, 0 };
        insertionSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 0, 5 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void insertionSort8Test() {
        int[] A = { 0, 0, 0, 5, 0, 0, 0 };
        insertionSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 5 };
        assertArrayEquals(expected, A);
    }

}

