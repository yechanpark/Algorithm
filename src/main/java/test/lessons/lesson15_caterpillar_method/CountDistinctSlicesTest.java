package test.lessons.lesson15_caterpillar_method;

import codility.lessons.lesson15_caterpillar_method.CountDistinctSlices;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CountDistinctSlicesTest {
    private CountDistinctSlices countDistinctSlices;

    @BeforeClass
    public void init() {
        this.countDistinctSlices = new CountDistinctSlices();
    }

    @Test
    public void sample1Test() {
        int M = 6;
        int[] A = {3, 4, 5, 5, 2};
        int actual = countDistinctSlices.solution(M, A);
        int expected = 9;
        assertEquals(actual, expected);
    }

}
