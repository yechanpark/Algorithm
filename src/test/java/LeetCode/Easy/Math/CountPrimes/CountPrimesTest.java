package LeetCode.Easy.Math.CountPrimes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountPrimesTest {
    private CountPrimes countPrimes;

    @BeforeEach
    public void init() {
        this.countPrimes = new CountPrimes();
    }

    @Test
    public void sample1Test() {
        int n = 10;
        int actual = countPrimes.solution(n);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int n = 3;
        int actual = countPrimes.solution(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int n = 7;
        int actual = countPrimes.solution(n);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        int n = 2;
        int actual = countPrimes.solution(n);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample5Test() {
        int n = 10000;
        int actual = countPrimes.solution(n);
        int expected = 1229;
        assertEquals(expected, actual);
    }

    @Test
    public void sample6Test() {
        int n = 499979;
        int actual = countPrimes.solution(n);
        int expected = 41537;
        assertEquals(expected, actual);
    }

}
