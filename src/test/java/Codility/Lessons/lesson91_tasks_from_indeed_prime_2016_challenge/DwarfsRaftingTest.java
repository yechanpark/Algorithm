package Codility.Lessons.lesson91_tasks_from_indeed_prime_2016_challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DwarfsRaftingTest {
    private DwarfsRafting dwarfsRafting;

    @BeforeEach
    public void init() {
        this.dwarfsRafting = new DwarfsRafting();
    }

    @Test
    public void sample1Test() {
        int N = 4;
        String S = "1B 1C 4B 1D 2A";
        String T = "3B 2D";
        int actual = dwarfsRafting.solution(N, S, T);
        int expected = 6;
        assertEquals(expected, actual);
    }

}
