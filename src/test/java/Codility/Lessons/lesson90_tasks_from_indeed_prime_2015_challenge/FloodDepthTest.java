package Codility.Lessons.lesson90_tasks_from_indeed_prime_2015_challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FloodDepthTest {
    private FloodDepth floodDepth;

    @BeforeEach
    public void init() {
        this.floodDepth = new FloodDepth();
    }

    @Test
    public void sample1Test() {
        int[] A = {1, 3, 2, 1, 2, 1, 5, 3, 3, 5, 2};
        int actual = floodDepth.solution(A);
        int expected = 2;
        assertEquals(expected, actual);
    }

/*    @Test
    public void sample2Test() {
        int[] A = {5, 8};
        int actual = floodDepth.solution(A);
        int expected = 0;
        assertEquals(expected, actual);
    }*/

}
