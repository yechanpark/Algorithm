package test.lessons.lesson9_maximun_slice_problem;

import codility.lessons.lesson9_maximum_slice_problem.MaxProfit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MaxProfitTest {
    private MaxProfit maxProfit;

    @BeforeClass
    public void init() {
        this.maxProfit = new MaxProfit();
    }

    @Test
    public void sample1Test() {
        int[] arr = {23171, 21011, 21123, 21366, 21013, 21367};
        int got = maxProfit.solution(arr);
        int answer = 356;
        assertEquals(got, answer);
    }

    @Test
    public void sample2Test() {
        int[] arr = {5, 4, 3, 2, 1};
        int got = maxProfit.solution(arr);
        int answer = 0;
        assertEquals(got, answer);
    }

    @Test
    public void sample3Test() {
        int[] arr = {8, 9, 3, 6, 1, 2};
        int got = maxProfit.solution(arr);
        int answer = 3;
        assertEquals(got, answer);
    }

}
