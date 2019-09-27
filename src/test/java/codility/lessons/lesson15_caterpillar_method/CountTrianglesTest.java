package codility.lessons.lesson15_caterpillar_method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CountTrianglesTest {
    private CountTriangles countTriangles;

    @BeforeClass
    public void init() {
        this.countTriangles = new CountTriangles();
    }

    @Test
    public void sample1Test() {
        int[] A = {10, 2, 5, 1, 8, 12};
        int actual = countTriangles.solution(A);
        int expected = 4;
        assertEquals(actual, expected);
    }

}
