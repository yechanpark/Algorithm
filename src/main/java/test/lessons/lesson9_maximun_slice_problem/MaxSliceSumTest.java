package test.lessons.lesson9_maximun_slice_problem;

import codility.lessons.lesson9_maximum_slice_problem.MaxSliceSum;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MaxSliceSumTest {
    private MaxSliceSum maxSliceSum;

    @BeforeClass
    public void init() {
        this.maxSliceSum = new MaxSliceSum();
    }

    @Test
    public void sample1Test() {
        int[] arr = {3, 2, -6, 4, 0};
        int actual = maxSliceSum.solution(arr);
        int expected = 5;
        assertEquals(actual, expected);
    }

    @Test
    public void sample2Test() {
        int[] arr = {1, 5, -1, 5, 1};
        int actual = maxSliceSum.solution(arr);
        int expected = 11;
        assertEquals(actual, expected);
    }

    @Test
    public void sample3Test() {
        int[] arr = {-2, -2};
        int actual = maxSliceSum.solution(arr);
        int expected = -2;
        assertEquals(actual, expected);
    }

}
