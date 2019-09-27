package codility.lessons.lesson6_sorting;

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
        int actual = maxProductOfThree.solution(arr);
        int expected = 60;
        assertEquals(actual, expected);
    }

    @Test
    public void sample2Test() {
        int[] arr = {-5, -6, -4, -7, -10};
        int actual = maxProductOfThree.solution(arr);
        int expected = -120;
        assertEquals(actual, expected);
    }
}
