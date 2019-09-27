package codility.lessons.lesson8_leader;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EquiLeaderTest {
    private EquiLeader equiLeader;

    @BeforeClass
    public void init() {
        this.equiLeader = new EquiLeader();
    }

    @Test
    public void sample1Test() {
        int[] arr = {4, 3, 4, 4, 4, 2};
        int actual = equiLeader.solution(arr);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    public void sample2Test() {
        int[] arr = {1, 2};
        int actual = equiLeader.solution(arr);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void sample3Test() {
        int[] arr = {1, 2, 3, 4, 5};
        int actual = equiLeader.solution(arr);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void sample4Test() {
        int[] arr = {4, 4, 2, 5, 3, 4, 4, 4};
        int actual = equiLeader.solution(arr);
        int expected = 3;
        assertEquals(actual, expected);
    }



}
