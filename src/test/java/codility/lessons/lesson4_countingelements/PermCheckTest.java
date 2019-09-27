package codility.lessons.lesson4_countingelements;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PermCheckTest {
    private PermCheck permCheck;

    @BeforeClass
    public void init() {
        this.permCheck = new PermCheck();
    }

    @Test
    public void sample1Test() {
        int[] arr = {4, 1, 3, 2};
        int actual = permCheck.solution(arr);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void sample2Test() {
        int[] arr = {4, 1, 3};
        int actual = permCheck.solution(arr);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
