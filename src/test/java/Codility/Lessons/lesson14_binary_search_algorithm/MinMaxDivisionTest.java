package Codility.Lessons.lesson14_binary_search_algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinMaxDivisionTest {
    private MinMaxDivision minMaxDivision;

    @BeforeEach
    public void init() {
        this.minMaxDivision = new MinMaxDivision();
    }

    @Test
    public void sample1Test() {
        int K = 3;
        int M = 5;
        int[] A = {2, 1, 5, 1, 2, 2, 2};
        int actual = minMaxDivision.solution(K, M, A);
        int expected = 6;
        assertEquals(expected, actual);
    }

}
