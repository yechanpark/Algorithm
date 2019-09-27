package codility.lessons.lesson1_iterations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryGapTest {
    private BinaryGap binaryGap;

    @BeforeEach
    public void init() {
        this.binaryGap = new BinaryGap();
    }

    @Test
    public void sample1Test() {
        int actual = binaryGap.solution(1041);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int actual = binaryGap.solution(15);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int actual = binaryGap.solution(32);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
