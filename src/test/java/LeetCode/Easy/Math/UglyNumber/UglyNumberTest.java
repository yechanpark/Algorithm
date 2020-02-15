package LeetCode.Easy.Math.UglyNumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UglyNumberTest {
    private UglyNumber uglyNumber;

    @BeforeEach
    public void init() {
        this.uglyNumber = new UglyNumber();
    }

    @Test
    public void sample1Test() {
        int num = 6; // 2 x 3
        assertTrue(uglyNumber.solution(num));
    }

    @Test
    public void sample2Test() {
        int num = 8; // 2 x 2 x 2
        assertTrue(uglyNumber.solution(num));
    }

    @Test
    public void sample3Test() {
        int num = 14; // 2 x 7
        assertFalse(uglyNumber.solution(num));
    }

    @Test
    public void sample4Test() {
        int num = -2147483648; // -1 x ...
        assertFalse(uglyNumber.solution(num));
    }

    @Test
    public void sample5Test() {
        int num = 1;
        assertTrue(uglyNumber.solution(num));
    }

}