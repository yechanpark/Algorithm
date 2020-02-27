package Examples.Math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    private Factorial factorial;

    @BeforeEach
    public void init() {
        this.factorial = new Factorial();
    }

    @Test
    public void factorial1Test() {
        int n = 1;
        int actual = factorial.factorial(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void factorial2Test() {
        int n = 2;
        int actual = factorial.factorial(n);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void factorial3Test() {
        int n = 3;
        int actual = factorial.factorial(n);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void factorial4Test() {
        int n = 4;
        int actual = factorial.factorial(n);
        int expected = 24;
        assertEquals(expected, actual);
    }

    @Test
    public void factorial5Test() {
        int n = 5;
        int actual = factorial.factorial(n);
        int expected = 120;
        assertEquals(expected, actual);
    }

    @Test
    public void factorial6Test() {
        int n = 6;
        int actual = factorial.factorial(n);
        int expected = 720;
        assertEquals(expected, actual);
    }

    @Test
    public void factorial7Test() {
        int n = 7;
        int actual = factorial.factorial(n);
        int expected = 5040;
        assertEquals(expected, actual);
    }

    @Test
    public void factorial8Test() {
        int n = 8;
        int actual = factorial.factorial(n);
        int expected = 40320;
        assertEquals(expected, actual);
    }

    @Test
    public void factorial9Test() {
        int n = 9;
        int actual = factorial.factorial(n);
        int expected = 362880;
        assertEquals(expected, actual);
    }

    @Test
    public void factorial10Test() {
        int n = 10;
        int actual = factorial.factorial(n);
        int expected = 3628800;
        assertEquals(expected, actual);
    }

}

