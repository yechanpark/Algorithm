package LeetCode.Easy.BitManipulation.MissingNumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {
    private MissingNumber missingNumber;

    @BeforeEach
    public void init() {
        this.missingNumber = new MissingNumber();
    }

    @Test
    public void sample1Test() {
        int[] nums = { 3, 0, 1 };
        int actual = missingNumber.solution(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        int actual = missingNumber.solution(nums);
        int expected = 8;
        assertEquals(expected, actual);
    }

}
