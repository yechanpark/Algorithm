package test.lessons.lesson4_countingelements;

import codility.lessons.lesson4_countingelements.PermCheck;
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
        int got = permCheck.solution(arr);
        int answer = 1;
        assertEquals(got, answer);
    }

    @Test
    public void sample2Test() {
        int[] arr = {4, 1, 3};
        int got = permCheck.solution(arr);
        int answer = 0;
        assertEquals(got, answer);
    }
}
