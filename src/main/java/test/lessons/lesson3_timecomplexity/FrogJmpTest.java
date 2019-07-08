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
        int got = frogJmp.solution(10, 85, 30);
        int answer = 3;
        assertEquals(got, answer);
    }
}
