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
        int n = 3; // 3! = 6
        int actual = factorialTrailingZeros.solution(n);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int n = 5; // 5! = 120
        int actual = factorialTrailingZeros.solution(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int n = 7; // 7! = 5040
        int actual = factorialTrailingZeros.solution(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        int n = 13; // 13! = 6227020800
        int actual = factorialTrailingZeros.solution(n);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void sample5Test() {
        int n = 30; // 30! = 2.6525286e+32
        int actual = factorialTrailingZeros.solution(n);
        int expected = 7;
        assertEquals(expected, actual);
    }

}
