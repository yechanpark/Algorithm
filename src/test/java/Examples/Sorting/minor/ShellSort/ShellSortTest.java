package Examples.Sorting.minor.ShellSort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ShellSortTest {
    private ShellSort shellSort;

    @BeforeEach
    public void init() {
        this.shellSort = new ShellSort();
    }

    @Test
    public void shellSort1Test() {
        int[] A = { 1 };
        shellSort.sort(A);
        int[] expected = { 1 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void shellSort2Test() {
        int[] A = { 1, 2 };
        shellSort.sort(A);
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void shellSort3Test() {
        int[] A = {};
        shellSort.sort(A);
        int[] expected = {};
        assertArrayEquals(expected, A);
    }

    @Test
    public void shellSort4Test() {
        int[] A = { 1, 6, 3, 5, 7, 8, 2};
        shellSort.sort(A);
        int[] expected = { 1, 2, 3, 5, 6, 7, 8 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void shellSort5Test() {
        int[] A = { 31, 37, 33, 21, 14, 39, 36, 28, 0, 57, 93 };
        shellSort.sort(A);
        int[] expected = { 0, 14, 21, 28, 31, 33, 36, 37, 39, 57, 93 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void shellSort6Test() {
        int[] A = { 0, 0, 0, 0, 0, 0, 0, 0 };
        shellSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 0, 0 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void shellSort7Test() {
        int[] A = { 0, 0, 0, 5, 0, 0, 0, 0 };
        shellSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 0, 5 };
        assertArrayEquals(expected, A);
    }

    @Test
    public void shellSort8Test() {
        int[] A = { 0, 0, 0, 5, 0, 0, 0 };
        shellSort.sort(A);
        int[] expected = { 0, 0, 0, 0, 0, 0, 5 };
        assertArrayEquals(expected, A);
    }

}

