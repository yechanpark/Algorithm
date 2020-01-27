package Codility.Lessons.lesson91_tasks_from_indeed_prime_2016_challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HilbertMazeTest {
    private HilbertMaze hilbertMaze;

    @BeforeEach
    public void init() {
        this.hilbertMaze = new HilbertMaze();
    }

    @Test
    public void sample1Test() {
        int N = 2;
        int A = 2;
        int B = 5;
        int C = 6;
        int D = 6;
        int actual = hilbertMaze.solution(N, A, B, C, D);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int N = 3;
        int A = 6;
        int B = 6;
        int C = 10;
        int D = 13;
        int actual = hilbertMaze.solution(N, A, B, C, D);
        int expected = 39;
        assertEquals(expected, actual);
    }

}
