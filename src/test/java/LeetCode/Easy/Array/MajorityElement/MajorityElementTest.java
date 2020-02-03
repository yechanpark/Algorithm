package LeetCode.Easy.Array.MajorityElement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {
    private MajorityElement majorityElement;

    @BeforeEach
    public void init() {
        this.majorityElement = new MajorityElement();
    }

    @Test
    public void sample1Test() {
        int[] nums = { 3, 2, 3 };
        int actual = majorityElement.solution(nums);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int actual = majorityElement.solution(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }


}
