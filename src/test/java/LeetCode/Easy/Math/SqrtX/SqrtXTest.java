package LeetCode.Easy.Math.SqrtX;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtXTest {
    private SqrtX sqrtX;

    @BeforeEach
    public void init() {
        this.sqrtX = new SqrtX();
    }

    @Test
    public void sample1Test() {
        int x = 4;
        int actual = sqrtX.solution(x);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int x = 8;
        int actual = sqrtX.solution(x);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int x = 0;
        int actual = sqrtX.solution(x);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        int x = 2147395600;
        int actual = sqrtX.solution(x);
        int expected = 46340;
        assertEquals(expected, actual);
    }

    @Test
    public void sample5Test() {
        int x = 25;
        int actual = sqrtX.solution(x);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void sample6Test() {
        int x = 35;
        int actual = sqrtX.solution(x);
        int expected = 5;
        assertEquals(expected, actual);
    }

}
