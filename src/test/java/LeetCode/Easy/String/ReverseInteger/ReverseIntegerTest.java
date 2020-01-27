package LeetCode.Easy.String.ReverseInteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {
    private ReverseInteger reverseInteger;

    @BeforeEach
    public void init() {
        this.reverseInteger = new ReverseInteger();
    }

    @Test
    public void sample1Test() {
        int x = 123;
        int actual = reverseInteger.solution(x);
        int expected = 321;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int x = -123;
        int actual = reverseInteger.solution(x);
        int expected = -321;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int x = 120;
        int actual = reverseInteger.solution(x);
        int expected = 21;
        assertEquals(expected, actual);
    }

}
