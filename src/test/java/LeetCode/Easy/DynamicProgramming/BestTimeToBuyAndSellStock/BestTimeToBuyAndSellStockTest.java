package LeetCode.Easy.DynamicProgramming.BestTimeToBuyAndSellStock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockTest {
    private BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock;

    @BeforeEach
    public void init() {
        this.bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
    }

    @Test
    public void sample1Test() {
        int[] nums = { 7, 1, 5, 3, 6, 4 };
        int actual = bestTimeToBuyAndSellStock.solution(nums);
        int expected = 5;
        assertEquals(expected, actual);
    }


    @Test
    public void sample2Test() {
        int[] nums = { 7, 6, 4, 3, 1 };
        int actual = bestTimeToBuyAndSellStock.solution(nums);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int[] nums = {};
        int actual = bestTimeToBuyAndSellStock.solution(nums);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        int[] nums = { 1, 2 };
        int actual = bestTimeToBuyAndSellStock.solution(nums);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample5Test() {
        int[] nums = { 7, 10, 1, 5 };
        int actual = bestTimeToBuyAndSellStock.solution(nums);
        int expected = 4;
        assertEquals(expected, actual);
    }

}
