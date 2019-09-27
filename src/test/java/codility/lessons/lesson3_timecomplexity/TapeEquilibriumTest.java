package codility.lessons.lesson3_timecomplexity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TapeEquilibriumTest {
    private TapeEquilibrium tapeEquilibrium;

    @BeforeEach
    public void init() {
        this.tapeEquilibrium = new TapeEquilibrium();
    }

    @Test
    public void sample1Test() {
        int[] arr = {3, 1, 2, 4, 3};
        int actual = tapeEquilibrium.solution(arr);
        int expected = 1;
        assertEquals(expected, actual);
    }
}
