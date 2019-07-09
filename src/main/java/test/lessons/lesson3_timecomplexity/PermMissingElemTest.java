package test.lessons.lesson3_timecomplexity;

import codility.lessons.lesson3_timecomplexity.PermMissingElem;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PermMissingElemTest {
    private PermMissingElem permMissingElem;

    @BeforeClass
    public void init() {
        this.permMissingElem = new PermMissingElem();
    }

    @Test
    public void sample1Test() {
        int[] arr = {2, 3, 1, 5};
        int got = permMissingElem.solution(arr);
        int answer = 4;
        assertEquals(got, answer);
    }
}
