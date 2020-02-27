package Examples.Math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {
    private Prime prime;

    @BeforeEach
    public void init() {
        this.prime = new Prime();
    }

    @Test
    public void countPrime1Test() {
        int n = 10;
        int actual = prime.countPrime(n);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void countPrime2Test() {
        int n = 3;
        int actual = prime.countPrime(n);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void countPrime3Test() {
        int n = 7;
        int actual = prime.countPrime(n);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void countPrime4Test() {
        int n = 2;
        int actual = prime.countPrime(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void countPrime5Test() {
        int n = 10000;
        int actual = prime.countPrime(n);
        int expected = 1229;
        assertEquals(expected, actual);
    }

    @Test
    public void countPrime6Test() {
        int n = 499979;
        int actual = prime.countPrime(n);
        int expected = 41538;
        assertEquals(expected, actual);
    }

    @Test
    public void isPrime1Test() {
        assertFalse(prime.isPrime(1));
    }

    @Test
    public void isPrime2Test() {
        assertTrue(prime.isPrime(2));
    }

    @Test
    public void isPrime3Test() {
        assertTrue(prime.isPrime(3));
    }

    @Test
    public void isPrime4Test() {
        assertFalse(prime.isPrime(4));
    }

    @Test
    public void isPrime5Test() {
        assertTrue(prime.isPrime(5));
    }

    @Test
    public void isPrime6Test() {
        assertFalse(prime.isPrime(6));
    }

    @Test
    public void isPrime7Test() {
        assertTrue(prime.isPrime(7));
    }

}

