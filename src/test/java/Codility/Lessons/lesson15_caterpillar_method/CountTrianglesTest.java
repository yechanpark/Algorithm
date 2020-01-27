package Codility.Lessons.lesson15_caterpillar_method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTrianglesTest {
    private CountTriangles countTriangles;

    @BeforeEach
    public void init() {
        this.countTriangles = new CountTriangles();
    }

    @Test
    public void sample1Test() {
        int[] A = {10, 2, 5, 1, 8, 12};
        int actual = countTriangles.solution(A);
        int expected = 4;
        assertEquals(expected, actual);
    }

}
