package Examples.Array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    public void init() {
        this.fibonacci = new Fibonacci();
    }

    @Test
    public void fibonacci0Test() {
        int n = 0;
        int actual = fibonacci.fibonacci(n);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci1Test() {
        int n = 1;
        int actual = fibonacci.fibonacci(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci2Test() {
        int n = 2;
        int actual = fibonacci.fibonacci(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci3Test() {
        int n = 3;
        int actual = fibonacci.fibonacci(n);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci4Test() {
        int n = 4;
        int actual = fibonacci.fibonacci(n);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci5Test() {
        int n = 5;
        int actual = fibonacci.fibonacci(n);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci6Test() {
        int n = 6;
        int actual = fibonacci.fibonacci(n);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci7Test() {
        int n = 7;
        int actual = fibonacci.fibonacci(n);
        int expected = 13;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci8Test() {
        int n = 8;
        int actual = fibonacci.fibonacci(n);
        int expected = 21;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci9Test() {
        int n = 9;
        int actual = fibonacci.fibonacci(n);
        int expected = 34;
        assertEquals(expected, actual);
    }

    @Test
    public void fibonacci10Test() {
        int n = 10;
        int actual = fibonacci.fibonacci(n);
        int expected = 55;
        assertEquals(expected, actual);
    }
}

