package test.lessons.lesson4_countingelements;

import codility.lessons.lesson4_countingelements.MissingInteger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MissingIntegerTest {
    private MissingInteger missingInteger;

    @BeforeClass
    public void init() {
        this.missingInteger = new MissingInteger();
    }

    @Test
    public void sample1Test() {
        int[] arr = {1, 3, 6, 4, 1, 2};
        int got = missingInteger.solution(arr);
        int answer = 5;
        assertEquals(got, answer);
    }

    @Test
    public void sample2Test() {
        int[] arr = {1, 2, 3};
        int got = missingInteger.solution(arr);
        int answer = 4;
        assertEquals(got, answer);
    }

    @Test
    public void sample3Test() {
        int[] arr = {-1, -3};
        int got = missingInteger.solution(arr);
        int answer = 1;
        assertEquals(got, answer);
    }
}
