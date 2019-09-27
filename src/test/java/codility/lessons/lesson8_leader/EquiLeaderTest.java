package codility.lessons.lesson8_leader;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquiLeaderTest {
    private EquiLeader equiLeader;

    @BeforeEach
    public void init() {
        this.equiLeader = new EquiLeader();
    }

    @Test
    public void sample1Test() {
        int[] arr = {4, 3, 4, 4, 4, 2};
        int actual = equiLeader.solution(arr);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int[] arr = {1, 2};
        int actual = equiLeader.solution(arr);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int[] arr = {1, 2, 3, 4, 5};
        int actual = equiLeader.solution(arr);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        int[] arr = {4, 4, 2, 5, 3, 4, 4, 4};
        int actual = equiLeader.solution(arr);
        int expected = 3;
        assertEquals(expected, actual);
    }



}
