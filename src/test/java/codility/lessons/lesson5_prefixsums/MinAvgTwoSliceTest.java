package codility.lessons.lesson5_prefixsums;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MinAvgTwoSliceTest {
    private MinAvgTwoSlice minAvgTwoSlice;

    @BeforeClass
    public void init() {
        this.minAvgTwoSlice = new MinAvgTwoSlice();
    }

    @Test
    public void sample1Test() {
        int[] arr = {4, 2, 2, 5, 1, 5, 8};

        int actual = minAvgTwoSlice.solution(arr);
        int expected = 1;

        assertEquals(actual, expected);
    }

}
