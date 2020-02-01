package LeetCode.Easy.Array.BestTimeToBuyAndSellStockII;

/**
 *
 */
public class BestTimeToBuyAndSellStockII_BestPractice {
    public int solution(int[] prices) {
        int total = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i+1] > prices[i]) {
                total += prices[i + 1] - prices[i];
            }
        }
        return total;
    }
}