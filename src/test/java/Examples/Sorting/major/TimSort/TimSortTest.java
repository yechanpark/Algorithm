package Examples.Sorting.major.TimSort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TimSortTest {
    private TimSort timSort;

    @BeforeEach
    public void init() {
        this.timSort = new TimSort();
    }

    @Test
    public void timSort1Test() {
        int[] A = { 1 };
        timSort.sort(A);
        int[] expected = { 1 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void timSort2Test() {
        int[] A = { 1, 2 };
        timSort.sort(A);
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void timSort3Test() {
        int[] A = {};
        timSort.sort(A);
        int[] expected = {};
        assertArrayEquals(expected, A);
    }

    @Test
    public void timSort4Test() {
        int[] A = { 1, 6, 3, 5, 7, 8, 2};
        timSort.sort(A);
        int[] expected = { 1, 2, 3, 5, 6, 7, 8 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void timSort5Test() {
        int[] A = { 31, 37, 33, 21, 14, 39, 36, 28, 0, 57, 93 };
        timSort.sort(A);
        int[] expected = { 0, 14, 21, 28, 31, 33, 36, 37, 39, 57, 93 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void timSort6Test() {
        int[] A = { 0, 0, 0, 0, 0, 0, 0, 0 };
        timSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 0, 0 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void timSort7Test() {
        int[] A = { 0, 0, 0, 5, 0, 0, 0, 0 };
        timSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 0, 5 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void timSort8Test() {
        int[] A = { 0, 0, 0, 5, 0, 0, 0 };
        timSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 5 };
        assertArrayEquals(expected, A);
    }

}

