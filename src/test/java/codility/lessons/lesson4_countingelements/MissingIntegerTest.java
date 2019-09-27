package codility.lessons.lesson4_countingelements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingIntegerTest {
    private MissingInteger missingInteger;

    @BeforeEach
    public void init() {
        this.missingInteger = new MissingInteger();
    }

    @Test
    public void sample1Test() {
        int[] arr = {1, 3, 6, 4, 1, 2};
        int actual = missingInteger.solution(arr);
        int expected = 5;
        assertEquals(actual, expected);
    }

    @Test
    public void sample2Test() {
        int[] arr = {1, 2, 3};
        int actual = missingInteger.solution(arr);
        int expected = 4;
        assertEquals(actual, expected);
    }

    @Test
    public void sample3Test() {
        int[] arr = {-1, -3};
        int actual = missingInteger.solution(arr);
        int expected = 1;
        assertEquals(actual, expected);
    }
}
