package test.lessons.lesson3_timecomplexity;

import codility.lessons.lesson3_timecomplexity.FrogJmp;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrogJmpTest {
    private FrogJmp frogJmp;

    @BeforeClass
    public void init() {
        this.frogJmp = new FrogJmp();
    }

    @Test
    public void sample1Test() {
        int actual = frogJmp.solution(10, 85, 30);
        int expected = 3;
        assertEquals(actual, expected);
    }
}
