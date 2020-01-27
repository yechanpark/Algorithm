package Programmers.Level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class K번째수Test {
    private K번째수 solution;

    @BeforeEach
    public void init() {
        this.solution = new K번째수();
    }

    @Test
    public void sample1Test() {
        int[] array = { 1, 5, 2, 6, 3, 7, 4 };
        int[][] commands = {
                { 2, 5, 3 },
                { 4, 4, 1 },
                { 1, 7, 3 }
        };
        int[] actual = solution.solution(array, commands);
        int[] expected = { 5, 6, 3 };
        assertArrayEquals(expected, actual);
    }

}
