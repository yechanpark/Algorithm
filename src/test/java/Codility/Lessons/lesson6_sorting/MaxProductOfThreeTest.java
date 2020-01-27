package Codility.Lessons.lesson6_sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxProductOfThreeTest {
    private MaxProductOfThree maxProductOfThree;

    @BeforeEach
    public void init() {
        this.maxProductOfThree = new MaxProductOfThree();
    }

    @Test
    public void sample1Test() {
        int[] arr = {-3, 1, 2, -2, 5, 6};
        int actual = maxProductOfThree.solution(arr);
        int expected = 60;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int[] arr = {-5, -6, -4, -7, -10};
        int actual = maxProductOfThree.solution(arr);
        int expected = -120;
        assertEquals(expected, actual);
    }
}
