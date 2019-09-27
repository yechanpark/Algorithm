package codility.lessons.lesson15_caterpillar_method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountDistinctSlicesTest {
    private CountDistinctSlices countDistinctSlices;

    @BeforeEach
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
