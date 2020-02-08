package LeetCode.Easy.BitManipulation.NumberOf1Bits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOf1BitsTest {
    private NumberOf1Bits numberOf1Bits;

    @BeforeEach
    public void init() {
        this.numberOf1Bits = new NumberOf1Bits();
    }

    @Test
    public void sample1Test() {
        int n = 11; // 00000000000000000000000000001011
        int actual = numberOf1Bits.solution(n);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int n = 128; // 00000000000000000000000010000000
        int actual = numberOf1Bits.solution(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

}
