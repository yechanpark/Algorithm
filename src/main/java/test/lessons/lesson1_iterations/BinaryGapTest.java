package test.lessons.lesson1_iterations;

import codility.lessons.lesson1_iterations.BinaryGap;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BinaryGapTest {
    private BinaryGap binaryGap;

    @BeforeClass
    public void init() {
        this.binaryGap = new BinaryGap();
    }

    @Test
    public void sample1Test() {
        int actual = binaryGap.solution(1041);
        int expected = 5;
        assertEquals(actual, expected);
    }

    @Test
    public void sample2Test() {
        int actual = binaryGap.solution(15);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void sample3Test() {
        int actual = binaryGap.solution(32);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
