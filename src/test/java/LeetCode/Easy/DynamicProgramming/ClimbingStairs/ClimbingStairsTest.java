package LeetCode.Easy.DynamicProgramming.ClimbingStairs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsTest {
    private ClimbingStairs climbingStairs;

    @BeforeEach
    public void init() {
        this.climbingStairs = new ClimbingStairs();
    }

    @Test
    public void sample1Test() {
        int x = 2;
        int actual = climbingStairs.solution(x);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int x = 3;
        int actual = climbingStairs.solution(x);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int x = 4;
        int actual = climbingStairs.solution(x);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        int x = 5;
        int actual = climbingStairs.solution(x);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void sample5Test() {
        int x = 1;
        int actual = climbingStairs.solution(x);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample6Test() {
        int x = 6;
        int actual = climbingStairs.solution(x);
        int expected = 13;
        assertEquals(expected, actual);
    }


}
