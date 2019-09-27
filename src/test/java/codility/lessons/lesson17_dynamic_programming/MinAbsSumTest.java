package codility.lessons.lesson17_dynamic_programming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinAbsSumTest {
    private MinAbsSum minAbsSum;

    @BeforeEach
    public void init() {
        this.minAbsSum = new MinAbsSum();
    }

    @Test
    public void sample1Test() {
        int[] A = {1, 5, 2, -2};
        int actual = minAbsSum.solution(A);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
