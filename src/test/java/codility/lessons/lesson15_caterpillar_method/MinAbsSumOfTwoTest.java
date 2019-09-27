package codility.lessons.lesson15_caterpillar_method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinAbsSumOfTwoTest {
    private MinAbsSumOfTwo minAbsSumOfTwo;

    @BeforeEach
    public void init() {
        this.minAbsSumOfTwo = new MinAbsSumOfTwo();
    }

    @Test
    public void sample1Test() {
        int[] A = {1, 4, -3};
        int actual = minAbsSumOfTwo.solution(A);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int[] A = {-8, 4, 5, -10, 3};
        int actual = minAbsSumOfTwo.solution(A);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int[] A = {1000000000};
        int actual = minAbsSumOfTwo.solution(A);
        int expected = 2000000000;
        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        int[] A = {0};
        int actual = minAbsSumOfTwo.solution(A);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample5Test() {
        int[] A = {-1000000000};
        int actual = minAbsSumOfTwo.solution(A);
        int expected = 2000000000;
        assertEquals(expected, actual);
    }

}
