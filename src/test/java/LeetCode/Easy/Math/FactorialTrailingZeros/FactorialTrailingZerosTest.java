package LeetCode.Easy.Math.FactorialTrailingZeros;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTrailingZerosTest {
    private FactorialTrailingZeros factorialTrailingZeros;

    @BeforeEach
    public void init() {
        this.factorialTrailingZeros = new FactorialTrailingZeros();
    }

    @Test
    public void sample1Test() {
        int n = 3;
        int actual = factorialTrailingZeros.solution(n);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int n = 5;
        int actual = factorialTrailingZeros.solution(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

}
