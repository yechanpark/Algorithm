package test.lessons.lesson13_fibonacci_numbers;

import codility.lessons.lesson13_fibonacci_numbers.FibFrog;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FibFrogTest {
    private FibFrog fibFrog;

    @BeforeClass
    public void init() {
        this.fibFrog = new FibFrog();
    }

    @Test
    public void sample1Test() {
        int[] A = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};
        int actual = fibFrog.solution(A);
        int expected = 3;
        assertEquals(actual, expected);
    }

}
