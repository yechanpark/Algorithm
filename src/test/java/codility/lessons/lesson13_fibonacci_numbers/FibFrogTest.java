package codility.lessons.lesson13_fibonacci_numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibFrogTest {
    private FibFrog fibFrog;

    @BeforeEach
    public void init() {
        this.fibFrog = new FibFrog();
    }

    @Test
    public void sample1Test() {
        int[] A = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};
        int actual = fibFrog.solution(A);
        int expected = 3;
        assertEquals(expected, actual);
    }

}
