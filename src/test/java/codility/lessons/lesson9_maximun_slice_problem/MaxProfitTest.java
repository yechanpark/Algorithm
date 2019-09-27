package codility.lessons.lesson9_maximun_slice_problem;

import codility.lessons.lesson9_maximum_slice_problem.MaxProfit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxProfitTest {
    private MaxProfit maxProfit;

    @BeforeEach
    public void init() {
        this.maxProfit = new MaxProfit();
    }

    @Test
    public void sample1Test() {
        int[] arr = {23171, 21011, 21123, 21366, 21013, 21367};
        int actual = maxProfit.solution(arr);
        int expected = 356;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int[] arr = {5, 4, 3, 2, 1};
        int actual = maxProfit.solution(arr);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int[] arr = {8, 9, 3, 6, 1, 2};
        int actual = maxProfit.solution(arr);
        int expected = 3;
        assertEquals(expected, actual);
    }

}
