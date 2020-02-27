package Examples.Math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumTest {
    private Sum sum;

    @BeforeEach
    public void init() {
        this.sum = new Sum();
    }

    @Test
    public void accumulativeSum1Test() {
        int n = 1;
        int actual = sum.accumulativeSum(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void accumulativeSum2Test() {
        int n = 2;
        int actual = sum.accumulativeSum(n);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void accumulativeSum3Test() {
        int n = 3;
        int actual = sum.accumulativeSum(n);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void accumulativeSum4Test() {
        int n = 4;
        int actual = sum.accumulativeSum(n);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void accumulativeSum5Test() {
        int n = 5;
        int actual = sum.accumulativeSum(n);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void accumulativeSum6Test() {
        int n = 6;
        int actual = sum.accumulativeSum(n);
        int expected = 21;
        assertEquals(expected, actual);
    }

    @Test
    public void accumulativeSum7Test() {
        int n = 7;
        int actual = sum.accumulativeSum(n);
        int expected = 28;
        assertEquals(expected, actual);
    }

    @Test
    public void accumulativeSum8Test() {
        int n = 8;
        int actual = sum.accumulativeSum(n);
        int expected = 36;
        assertEquals(expected, actual);
    }

    @Test
    public void accumulativeSum9Test() {
        int n = 9;
        int actual = sum.accumulativeSum(n);
        int expected = 45;
        assertEquals(expected, actual);
    }

    @Test
    public void accumulativeSum10Test() {
        int n = 10;
        int actual = sum.accumulativeSum(n);
        int expected = 55;
        assertEquals(expected, actual);
    }
}

