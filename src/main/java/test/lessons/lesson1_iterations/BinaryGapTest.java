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
        int got = binaryGap.solution(1041);
        int answer = 5;
        assertEquals(got, answer);
    }

    @Test
    public void sample2Test() {
        int got = binaryGap.solution(15);
        int answer = 0;
        assertEquals(got, answer);
    }

    @Test
    public void sample3Test() {
        int got = binaryGap.solution(32);
        int answer = 0;
        assertEquals(got, answer);
    }
}
