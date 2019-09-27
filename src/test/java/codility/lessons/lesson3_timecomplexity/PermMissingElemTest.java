package codility.lessons.lesson3_timecomplexity;

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
        int actual = permMissingElem.solution(arr);
        int expected = 4;
        assertEquals(actual, expected);
    }
}
