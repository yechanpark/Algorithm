package LeetCode.Easy.DynamicProgramming.HouseRobber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseRobberTest {
    private HouseRobber houseRobber;

    @BeforeEach
    public void init() {
        this.houseRobber = new HouseRobber();
    }

    @Test
    public void sample1Test() {
        int[] nums = { 1, 2, 3, 1 };
        int actual = houseRobber.solution(nums);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int[] nums = { 2, 7, 9, 3, 1 };
        int actual = houseRobber.solution(nums);
        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int[] nums = { 2, 1, 1, 3 };
        int actual = houseRobber.solution(nums);
        int expected = 5;
        assertEquals(expected, actual);
    }

}
