package codility.lessons.lesson6_sorting;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumberOfDiscIntersectionsTest {
    private NumberOfDiscIntersections numberOfDiscIntersections;

    @BeforeClass
    public void init() {
        this.numberOfDiscIntersections = new NumberOfDiscIntersections();
    }

    @Test
    public void sample1Test() {
        int[] arr = {1, 5, 2, 1, 4, 0};
        int actual = numberOfDiscIntersections.solution(arr);
        int expected = 11;
        assertEquals(actual, expected);
    }

}
