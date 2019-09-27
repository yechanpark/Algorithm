package codility.lessons.lesson5_prefixsums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinAvgTwoSliceTest {
    private MinAvgTwoSlice minAvgTwoSlice;

    @BeforeEach
    public void init() {
        this.minAvgTwoSlice = new MinAvgTwoSlice();
    }

    @Test
    public void sample1Test() {
        int[] arr = {4, 2, 2, 5, 1, 5, 8};

        int actual = minAvgTwoSlice.solution(arr);
        int expected = 1;

        assertEquals(expected, actual);
    }

}
