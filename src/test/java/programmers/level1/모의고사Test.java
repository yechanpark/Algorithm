package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class 모의고사Test {
    private 모의고사 solution;

    @BeforeEach
    public void init() {
        this.solution = new 모의고사();
    }

    @Test
    public void sample1Test() {
        int[] answers = { 1, 2, 3, 4, 5 };
        int[] actual = solution.solution(answers);
        int[] expected = { 1 };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int[] answers = { 1, 3, 2, 4, 2 };
        int[] actual = solution.solution(answers);
        int[] expected = { 1, 2, 3 };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int[] answers = { 4, 4, 4 };
        int[] actual = solution.solution(answers);
        int[] expected = { 1, 2, 3 };
        assertArrayEquals(expected, actual);
    }

}
