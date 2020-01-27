package LeetCode.Easy.Array.RemoveElement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveElementTest {
    private RemoveElement removeElement;

    @BeforeEach
    public void init() {
        this.removeElement = new RemoveElement();
    }

    @Test
    public void sample1Test() {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int actual = removeElement.solution(nums, val);
        int[] expected = { 2, 2 };

        boolean result = true;

        if (actual != expected.length)
            result = false;

        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != nums[i]) result = false;
        }

        assert(result);
    }

    @Test
    public void sample2Test() {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int actual = removeElement.solution(nums, val);
        int[] expected = { 0, 1, 3, 0, 4 };

        boolean result = true;

        if (actual != expected.length)
            result = false;

        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != nums[i]) result = false;
        }

        assert(result);
    }


}
