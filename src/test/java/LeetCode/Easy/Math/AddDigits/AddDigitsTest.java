package LeetCode.Easy.Math.AddDigits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddDigitsTest {
    private AddDigits addDigits;

    @BeforeEach
    public void init() {
        this.addDigits = new AddDigits();
    }

    @Test
    public void sample1Test() {
        int n = 38;
        int actual = addDigits.solution(n);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int n = 10;
        int actual = addDigits.solution(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

}
