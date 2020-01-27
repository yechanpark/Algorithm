package Codility.Lessons.lesson4_countingelements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaxCountersTest {
    private MaxCounters maxCounters;

    @BeforeEach
    public void init() {
        this.maxCounters = new MaxCounters();
    }

    @Test
    public void sample1Test() {
        int[] arr = {3, 4, 4, 6, 1, 4, 4};
        int[] actual = maxCounters.solution(5, arr);
        int[] expected = {3, 2, 2, 4, 2};
        assertArrayEquals(expected, actual);
    }
}
