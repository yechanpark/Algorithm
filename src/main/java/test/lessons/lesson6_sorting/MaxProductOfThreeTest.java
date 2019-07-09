package test.lessons.lesson6_sorting;

import codility.lessons.lesson6_sorting.MaxProductOfThree;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MaxProductOfThreeTest {
    private MaxProductOfThree maxProductOfThree;

    @BeforeClass
    public void init() {
        this.maxProductOfThree = new MaxProductOfThree();
    }

    @Test
    public void sample1Test() {
        int[] arr = {-3, 1, 2, -2, 5, 6};
        int got = maxProductOfThree.solution(arr);
        int answer = 60;
        assertEquals(got, answer);
    }
}
