package test.lessons.lesson2_arrays;

import codility.lessons.lesson2_arrays.CyclicRotation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CyclicRotationTest {
    private CyclicRotation cyclicRotation;

    @BeforeClass
    public void init() {
        this.cyclicRotation = new CyclicRotation();
    }

    @Test
    public void sample1Test() {
        int[] arr = {3, 8, 9, 7, 6};
        int[] actual = cyclicRotation.solution(arr, 3);
        int[] expected = {9, 7, 6, 3, 8};
        assertEquals(actual, expected);
    }

    @Test
    public void sample2Test() {
        int[] arr = {0, 0, 0};
        int[] actual = cyclicRotation.solution(arr, 1);
        int[] expected = {0, 0, 0};
        assertEquals(actual, expected);
    }

    @Test
    public void sample3Test() {
        int[] arr = {1, 2, 3, 4};
        int[] actual = cyclicRotation.solution(arr, 4);
        int[] expected = {1, 2, 3, 4};
        assertEquals(actual, expected);
    }
}
