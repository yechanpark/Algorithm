package test.lessons.lesson4_countingelements;

import codility.lessons.lesson4_countingelements.MaxCounters;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MaxCountersTest {
    private MaxCounters maxCounters;

    @BeforeClass
    public void init() {
        this.maxCounters = new MaxCounters();
    }

    @Test
    public void sample1Test() {
        int[] arr = {3, 4, 4, 6, 1, 4, 4};
        int[] actual = maxCounters.solution(5, arr);
        int[] expected = {3, 2, 2, 4, 2};
        assertEquals(actual, expected);
    }
}
