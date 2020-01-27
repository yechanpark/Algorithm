package LeetCode.Easy.Map.TwoSum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    private TwoSum twoSum;

    @BeforeEach
    public void init() {
        this.twoSum = new TwoSum();
    }

    @Test
    public void sample1Test() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] actual = twoSum.solution(nums, target);
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int[] nums = { 3, 3 };
        int target = 6;
        int[] actual = twoSum.solution(nums, target);
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, actual);
    }

}
