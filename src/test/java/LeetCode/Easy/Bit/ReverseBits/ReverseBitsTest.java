package LeetCode.Easy.Bit.ReverseBits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseBitsTest {
    private ReverseBits reverseBits;

    @BeforeEach
    public void init() {
        this.reverseBits = new ReverseBits();
    }

    @Test
    public void sample1Test() {
        int n = 43261596; // 00000010100101000001111010011100
        int actual = reverseBits.solution(n);
        int expected = 964176192; // 00111001011110000010100101000000
        assertEquals(expected, actual);
    }

}
