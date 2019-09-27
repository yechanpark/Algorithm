package codility.lessons.lesson3_timecomplexity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermMissingElemTest {
    private PermMissingElem permMissingElem;

    @BeforeEach
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
