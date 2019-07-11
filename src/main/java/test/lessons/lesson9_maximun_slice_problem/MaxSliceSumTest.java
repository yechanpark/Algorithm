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
        int got = maxSliceSum.solution(arr);
        int answer = 5;
        assertEquals(got, answer);
    }

    @Test
    public void sample2Test() {
        int[] arr = {1, 5, -1, 5, 1};
        int got = maxSliceSum.solution(arr);
        int answer = 11;
        assertEquals(got, answer);
    }

    @Test
    public void sample3Test() {
        int[] arr = {-2, -2};
        int got = maxSliceSum.solution(arr);
        int answer = -2;
        assertEquals(got, answer);
    }

}
