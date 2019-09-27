package codility.lessons.lesson9_maximun_slice_problem;

import codility.lessons.lesson9_maximum_slice_problem.MaxDoubleSliceSum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxDoubleSliceSumTest {
    private MaxDoubleSliceSum maxDoubleSliceSum;

    @BeforeEach
    public void init() {
        this.maxDoubleSliceSum = new MaxDoubleSliceSum();
    }

    @Test
    public void sample1Test() {
        int[] arr = {3, 2, 6, -1, 4, 5, -1, 2};
        int actual = maxDoubleSliceSum.solution(arr);
        int expected = 17;
        assertEquals(expected, actual);
    }

}
