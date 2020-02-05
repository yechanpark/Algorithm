package LeetCode.Easy.Array.RotateArray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateArrayTest {
    private RotateArray rotateArray;

    @BeforeEach
    public void init() {
        this.rotateArray = new RotateArray();
    }

    @Test
    public void sample1Test() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotateArray.solution(nums, k);
        int[] expected = { 5, 6, 7, 1, 2, 3, 4 };

        assertArrayEquals(nums, expected);
    }

    @Test
    public void sample2Test() {
        int[] nums = { 1, 2 };
        int k = 1;
        rotateArray.solution(nums, k);
        int[] expected = { 2, 1 };

        assertArrayEquals(nums, expected);
    }

}
