package codility.lessons.lesson10_prime_and_composite_numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeaksTest {
    private Peaks peaks;

    @BeforeEach
    public void init() {
        this.peaks = new Peaks();
    }

    @Test
    public void sample1Test() {
        int[] A = {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        int actual = peaks.solution(A);
        int expected = 3;
        assertEquals(actual, expected);
    }

}
