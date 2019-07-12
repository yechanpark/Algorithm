package test.lessons.lesson10_prime_and_composite_numbers;

import codility.lessons.lesson10_prime_and_composite_numbers.Peaks;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PeaksTest {
    private Peaks peaks;

    @BeforeClass
    public void init() {
        this.peaks = new Peaks();
    }

    @Test
    public void sample1Test() {
        int[] A = {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        int got = peaks.solution(A);
        int answer = 3;
        assertEquals(got, answer);
    }

}
