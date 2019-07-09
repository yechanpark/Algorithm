package test.lessons.lesson6_sorting;

import codility.lessons.lesson6_sorting.Distinct;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DistinctTest {
    private Distinct distinct;

    @BeforeClass
    public void init() {
        this.distinct = new Distinct();
    }

    @Test
    public void sample1Test() {
        int[] arr = {2, 1, 1, 2, 3, 1};
        int got = distinct.solution(arr);
        int answer = 3;
        assertEquals(got, answer);
    }

    @Test
    public void sample2Test() {
        int[] arr = {0};
        int got = distinct.solution(arr);
        int answer = 1;
        assertEquals(got, answer);
    }

    @Test
    public void sample3Test() {
        int[] arr = {};
        int got = distinct.solution(arr);
        int answer = 0;
        assertEquals(got, answer);
    }

}
