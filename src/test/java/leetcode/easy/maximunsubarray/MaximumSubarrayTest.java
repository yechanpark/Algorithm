package leetcode.easy.maximunsubarray;

import leetcode.easy.maximumsubarray.MaximumSubarray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarrayTest {
    private MaximumSubarray maximumSubarray;

    @BeforeEach
    public void init() {
        this.maximumSubarray = new MaximumSubarray();
    }

    @Test
    public void sample1Test() {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int actual = maximumSubarray.solution(nums);
        int expected = 6;
        assertEquals(expected, actual);
    }


}
