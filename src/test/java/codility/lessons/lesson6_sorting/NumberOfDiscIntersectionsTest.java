package codility.lessons.lesson6_sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfDiscIntersectionsTest {
    private NumberOfDiscIntersections numberOfDiscIntersections;

    @BeforeEach
    public void init() {
        this.numberOfDiscIntersections = new NumberOfDiscIntersections();
    }

    @Test
    public void sample1Test() {
        int[] arr = {1, 5, 2, 1, 4, 0};
        int actual = numberOfDiscIntersections.solution(arr);
        int expected = 11;
        assertEquals(expected, actual);
    }

}
