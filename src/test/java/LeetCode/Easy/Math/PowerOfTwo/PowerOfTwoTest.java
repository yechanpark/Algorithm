package LeetCode.Easy.Math.PowerOfTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PowerOfTwoTest {
    private PowerOfTwo powerOfTwo;

    @BeforeEach
    public void init() {
        this.powerOfTwo = new PowerOfTwo();
    }

    @Test
    public void sample1Test() {
        assertFalse(powerOfTwo.solution(0));
    }

    @Test
    public void sample2Test() {
        assertTrue(powerOfTwo.solution(1));
    }

    @Test
    public void sample3Test() {
        assertTrue(powerOfTwo.solution(2));
    }

    @Test
    public void sample4Test() {
        assertTrue(powerOfTwo.solution(4));
    }

    @Test
    public void sample5Test() {
        assertFalse(powerOfTwo.solution(-2147483648));
    }
}
