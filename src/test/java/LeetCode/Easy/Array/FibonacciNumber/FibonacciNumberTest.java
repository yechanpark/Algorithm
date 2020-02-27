package LeetCode.Easy.Array.FibonacciNumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciNumberTest {
    private FibonacciNumber fibonacciNumber;

    @BeforeEach
    public void init() {
        this.fibonacciNumber = new FibonacciNumber();
    }

    @Test
    public void fibonacci0Test() {
        int n = 0;
        int actual = fibonacciNumber.solution(n);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci1Test() {
        int n = 1;
        int actual = fibonacciNumber.solution(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci2Test() {
        int n = 2;
        int actual = fibonacciNumber.solution(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci3Test() {
        int n = 3;
        int actual = fibonacciNumber.solution(n);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci4Test() {
        int n = 4;
        int actual = fibonacciNumber.solution(n);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci5Test() {
        int n = 5;
        int actual = fibonacciNumber.solution(n);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci6Test() {
        int n = 6;
        int actual = fibonacciNumber.solution(n);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci7Test() {
        int n = 7;
        int actual = fibonacciNumber.solution(n);
        int expected = 13;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci8Test() {
        int n = 8;
        int actual = fibonacciNumber.solution(n);
        int expected = 21;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci9Test() {
        int n = 9;
        int actual = fibonacciNumber.solution(n);
        int expected = 34;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci10Test() {
        int n = 10;
        int actual = fibonacciNumber.solution(n);
        int expected = 55;
        assertEquals(expected, actual);
    }

}
