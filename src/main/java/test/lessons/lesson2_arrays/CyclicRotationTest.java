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
        int[] got = cyclicRotation.solution(arr, 3);
        int[] answer = {9, 7, 6, 3, 8};
        assertEquals(got, answer);
    }

    @Test
    public void sample2Test() {
        int[] arr = {0, 0, 0};
        int[] got = cyclicRotation.solution(arr, 1);
        int[] answer = {0, 0, 0};
        assertEquals(got, answer);
    }

    @Test
    public void sample3Test() {
        int[] arr = {1, 2, 3, 4};
        int[] got = cyclicRotation.solution(arr, 4);
        int[] answer = {1, 2, 3, 4};
        assertEquals(got, answer);
    }
}
