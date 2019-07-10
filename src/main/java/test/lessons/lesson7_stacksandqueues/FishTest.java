package test.lessons.lesson7_stacksandqueues;

import codility.lessons.lesson7_stacksandqueues.Fish;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FishTest {
    private Fish fish;

    @BeforeClass
    public void init() {
        this.fish = new Fish();
    }

    @Test
    public void sample1Test() {
        int[] a = {4, 3, 2, 1, 5};
        int[] b = {0, 1, 0, 0, 0};
        int got = fish.solution(a, b);
        int answer = 2;
        assertEquals(got, answer);
    }

}
