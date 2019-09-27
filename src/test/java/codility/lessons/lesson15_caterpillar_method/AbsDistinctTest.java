package codility.lessons.lesson15_caterpillar_method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsDistinctTest {
    private AbsDistinct absDistinct;

    @BeforeEach
    public void init() {
        this.absDistinct = new AbsDistinct();
    }

    @Test
    public void sample1Test() {
        int[] A = {-5, -3, -1, 0, 3, 6};
        int actual = absDistinct.solution(A);
        int expected = 5;
        assertEquals(actual, expected);
    }

    @Test
    public void sample2Test() {
        int[] A = {-10, -10, -1, 0, 3, 6};
        int actual = absDistinct.solution(A);
        int expected = 5;
        assertEquals(actual, expected);
    }

}
