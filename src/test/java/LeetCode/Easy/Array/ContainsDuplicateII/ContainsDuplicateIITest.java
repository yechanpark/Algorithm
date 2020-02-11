package LeetCode.Easy.Array.ContainsDuplicateII;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateIITest {
    private ContainsDuplicateII containsDuplicateII;

    @BeforeEach
    public void init() {
        this.containsDuplicateII = new ContainsDuplicateII();
    }

    @Test
    public void sample1Test() {
        int[] nums = { 1, 2, 3, 1 };
        int k = 3;
        boolean actual = containsDuplicateII.solution(nums, k);
        assertTrue(actual);
    }

    @Test
    public void sample2Test() {
        int[] nums = { 1, 0, 1, 1 };
        int k = 1;
        boolean actual = containsDuplicateII.solution(nums, k);
        assertTrue(actual);
    }

    @Test
    public void sample3Test() {
        int[] nums = { 1, 2, 3, 1, 2, 3 };
        int k = 2;
        boolean actual = containsDuplicateII.solution(nums, k);
        assertFalse(actual);
    }

    @Test
    public void sample4Test() {
        int[] nums = { 1 };
        int k = 1;
        boolean actual = containsDuplicateII.solution(nums, k);
        assertFalse(actual);
    }

}
