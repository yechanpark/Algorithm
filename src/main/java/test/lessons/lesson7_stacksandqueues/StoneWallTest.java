package test.lessons.lesson7_stacksandqueues;

import codility.lessons.lesson7_stacksandqueues.StoneWall;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StoneWallTest {
    private StoneWall stoneWall;

    @BeforeClass
    public void init() {
        this.stoneWall = new StoneWall();
    }

    @Test
    public void sample1Test() {
        int[] arr = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        int got = stoneWall.solution(arr);
        int answer = 7;
        assertEquals(got, answer);
    }

}
