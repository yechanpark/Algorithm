package test.lessons.lesson9_maximun_slice_problem;

import codility.lessons.lesson9_maximum_slice_problem.MaxDoubleSliceSum;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MaxDoubleSliceSumTest {
    private MaxDoubleSliceSum maxDoubleSliceSum;

    @BeforeClass
    public void init() {
        this.maxDoubleSliceSum = new MaxDoubleSliceSum();
    }

    @Test
    public void sample1Test() {
        int[] arr = {3, 2, 6, -1, 4, 5, -1, 2};
        int got = maxDoubleSliceSum.solution(arr);
        int answer = 17;
        assertEquals(got, answer);
    }

}
