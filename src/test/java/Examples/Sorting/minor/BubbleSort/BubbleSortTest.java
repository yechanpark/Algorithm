package Examples.Sorting.minor.BubbleSort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {
    private BubbleSort bubbleSort;

    @BeforeEach
    public void init() {
        this.bubbleSort = new BubbleSort();
    }

    @Test
    public void bubbleSort1Test() {
        int[] A = { 1 };
        bubbleSort.sort(A);
        int[] expected = { 1 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void bubbleSort2Test() {
        int[] A = { 1, 2 };
        bubbleSort.sort(A);
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void bubbleSort3Test() {
        int[] A = {};
        bubbleSort.sort(A);
        int[] expected = {};
        assertArrayEquals(expected, A);
    }

    @Test
    public void bubbleSort4Test() {
        int[] A = { 1, 6, 3, 5, 7, 8, 2};
        bubbleSort.sort(A);
        int[] expected = { 1, 2, 3, 5, 6, 7, 8 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void bubbleSort5Test() {
        int[] A = { 31, 37, 33, 21, 14, 39, 36, 28, 0, 57, 93 };
        bubbleSort.sort(A);
        int[] expected = { 0, 14, 21, 28, 31, 33, 36, 37, 39, 57, 93 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void bubbleSort6Test() {
        int[] A = { 0, 0, 0, 0, 0, 0, 0, 0 };
        bubbleSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 0, 0 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void bubbleSort7Test() {
        int[] A = { 0, 0, 0, 5, 0, 0, 0, 0 };
        bubbleSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 0, 5 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void bubbleSort8Test() {
        int[] A = { 0, 0, 0, 5, 0, 0, 0 };
        bubbleSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 5 };
        assertArrayEquals(expected, A);
    }

}

