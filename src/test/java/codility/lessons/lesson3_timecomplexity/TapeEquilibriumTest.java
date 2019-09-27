package codility.lessons.lesson3_timecomplexity;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TapeEquilibriumTest {
    private TapeEquilibrium tapeEquilibrium;

    @BeforeClass
    public void init() {
        this.tapeEquilibrium = new TapeEquilibrium();
    }

    @Test
    public void sample1Test() {
        int[] arr = {3, 1, 2, 4, 3};
        int actual = tapeEquilibrium.solution(arr);
        int expected = 1;
        assertEquals(actual, expected);
    }
}
