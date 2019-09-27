package codility.lessons.lesson2_arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CyclicRotationTest {
    private CyclicRotation cyclicRotation;

    @BeforeEach
    public void init() {
        this.cyclicRotation = new CyclicRotation();
    }

    @Test
    public void sample1Test() {
        int[] arr = {3, 8, 9, 7, 6};
        int[] actual = cyclicRotation.solution(arr, 3);
        int[] expected = {9, 7, 6, 3, 8};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void sample2Test() {
        int[] arr = {0, 0, 0};
        int[] actual = cyclicRotation.solution(arr, 1);
        int[] expected = {0, 0, 0};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void sample3Test() {
        int[] arr = {1, 2, 3, 4};
        int[] actual = cyclicRotation.solution(arr, 4);
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(actual, expected);
    }
}
