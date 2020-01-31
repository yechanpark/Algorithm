package LeetCode.Easy.Array.BestTimeToBuyAndSellStockII;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockIITest {
    private BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII;

    @BeforeEach
    public void init() {
        this.bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();
    }

    @Test
    public void sample1Test() {
        int[] nums = { 7, 1, 5, 3, 6, 4 };
        int actual = bestTimeToBuyAndSellStockII.solution(nums);
        int expected = 7;
        assertEquals(expected, actual);
    }


    @Test
    public void sample2Test() {
        int[] nums = { 7, 6, 4, 3, 1 };
        int actual = bestTimeToBuyAndSellStockII.solution(nums);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int[] nums = {};
        int actual = bestTimeToBuyAndSellStockII.solution(nums);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        int[] nums = { 1, 2 };
        int actual = bestTimeToBuyAndSellStockII.solution(nums);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample5Test() {
        int[] nums = { 7, 10, 1, 5 };
        int actual = bestTimeToBuyAndSellStockII.solution(nums);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void sample6Test() {
        int[] nums = { 1, 2, 3, 4, 5 };
        int actual = bestTimeToBuyAndSellStockII.solution(nums);
        int expected = 4;
        assertEquals(expected, actual);
    }

}
