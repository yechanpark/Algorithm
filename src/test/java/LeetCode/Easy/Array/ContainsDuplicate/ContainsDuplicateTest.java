package LeetCode.Easy.Array.ContainsDuplicate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {
    private ContainsDuplicate containsDuplicate;

    @BeforeEach
    public void init() {
        this.containsDuplicate = new ContainsDuplicate();
    }

    @Test
    public void sample1Test() {
        int[] nums = { 1, 2, 3, 1 };
        boolean actual = containsDuplicate.solution(nums);
        assertTrue(actual);
    }

    @Test
    public void sample2Test() {
        int[] nums = { 1, 2, 3, 4 };
        boolean actual = containsDuplicate.solution(nums);
        assertFalse(actual);
    }

    @Test
    public void sample3Test() {
        int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        boolean actual = containsDuplicate.solution(nums);
        assertTrue(actual);
    }

}
