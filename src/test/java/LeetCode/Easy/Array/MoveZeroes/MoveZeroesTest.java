package LeetCode.Easy.Array.MoveZeroes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZeroesTest {
    private MoveZeroes moveZeroes;

    @BeforeEach
    public void init() {
        this.moveZeroes = new MoveZeroes();
    }

    @Test
    public void sample1Test() {
        int[] actual = { 0, 1, 0, 3, 12 };
        moveZeroes.solution(actual);
        int[] expected = { 1, 3, 12, 0, 0 };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int[] actual = { 1 };
        moveZeroes.solution(actual);
        int[] expected = { 1 };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int[] actual = { 2, 1 };
        moveZeroes.solution(actual);
        int[] expected = { 2, 1 };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        int[] actual = { 1, 0, 1 };
        moveZeroes.solution(actual);
        int[] expected = { 1, 1, 0 };
        assertArrayEquals(expected, actual);
    }

}
