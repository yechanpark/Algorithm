package Codility.Lessons.lesson4_countingelements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermCheckTest {
    private PermCheck permCheck;

    @BeforeEach
    public void init() {
        this.permCheck = new PermCheck();
    }

    @Test
    public void sample1Test() {
        int[] arr = {4, 1, 3, 2};
        int actual = permCheck.solution(arr);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int[] arr = {4, 1, 3};
        int actual = permCheck.solution(arr);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
