package LeetCode.Easy.Array.PlusOne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PlusOneTest {
    private PlusOne plusOne;

    @BeforeEach
    public void init() {
        this.plusOne = new PlusOne();
    }

    @Test
    public void sample1Test() {
        int[] x = { 1, 2, 3 };
        int[] actual = plusOne.solution(x);
        int[] expected = { 1, 2, 4 };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int[] x = { 4, 3, 2, 1 };
        int[] actual = plusOne.solution(x);
        int[] expected = { 4, 3, 2, 2 };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int[] x = { 9 };
        int[] actual = plusOne.solution(x);
        int[] expected = { 1, 0 };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        int[] x = { 9, 9 };
        int[] actual = plusOne.solution(x);
        int[] expected = { 1, 0, 0 };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sample5Test() {
        int[] x = { 8, 9, 9, 9 };
        int[] actual = plusOne.solution(x);
        int[] expected = { 9, 0, 0, 0 };
        assertArrayEquals(expected, actual);
    }

}
