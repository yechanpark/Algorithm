package codility.lessons.lesson6_sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistinctTest {
    private Distinct distinct;

    @BeforeEach
    public void init() {
        this.distinct = new Distinct();
    }

    @Test
    public void sample1Test() {
        int[] arr = {2, 1, 1, 2, 3, 1};
        int actual = distinct.solution(arr);
        int expected = 3;
        assertEquals(actual, expected);
    }

    @Test
    public void sample2Test() {
        int[] arr = {0};
        int actual = distinct.solution(arr);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void sample3Test() {
        int[] arr = {};
        int actual = distinct.solution(arr);
        int expected = 0;
        assertEquals(actual, expected);
    }

}
