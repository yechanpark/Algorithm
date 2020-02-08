package LeetCode.Easy.Array.TwoSumII;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumIITest {
    private TwoSumII twoSumII;

    @BeforeEach
    public void init() {
        this.twoSumII = new TwoSumII();
    }

    @Test
    public void sample1Test() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] actual = twoSumII.solution(nums, target);
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int[] nums = { 0, 0, 3, 4 };
        int target = 0;
        int[] actual = twoSumII.solution(nums, target);
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, actual);
    }

}
