package LeetCode.Easy.Array.SingleNumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {
    private SingleNumber singleNumber;

    @BeforeEach
    public void init() {
        this.singleNumber = new SingleNumber();
    }

    @Test
    public void sample1Test() {
        int[] nums = { 2, 2, 1 };
        int actual = singleNumber.solution(nums);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int[] nums = { 4, 1, 2, 1, 2 };
        int actual = singleNumber.solution(nums);
        int expected = 4;
        assertEquals(expected, actual);
    }

}
