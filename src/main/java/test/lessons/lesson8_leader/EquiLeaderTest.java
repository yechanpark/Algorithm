package test.lessons.lesson8_leader;

import codility.lessons.lesson8_leader.EquiLeader;
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
        int got = equiLeader.solution(arr);
        int answer = 2;
        assertEquals(got, answer);
    }

    @Test
    public void sample2Test() {
        int[] arr = {1, 2};
        int got = equiLeader.solution(arr);
        int answer = 0;
        assertEquals(got, answer);
    }

    @Test
    public void sample3Test() {
        int[] arr = {1, 2, 3, 4, 5};
        int got = equiLeader.solution(arr);
        int answer = 0;
        assertEquals(got, answer);
    }

    @Test
    public void sample4Test() {
        int[] arr = {4, 4, 2, 5, 3, 4, 4, 4};
        int got = equiLeader.solution(arr);
        int answer = 3;
        assertEquals(got, answer);
    }



}
