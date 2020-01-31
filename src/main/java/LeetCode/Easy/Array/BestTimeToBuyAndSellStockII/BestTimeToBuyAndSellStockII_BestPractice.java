package LeetCode.Easy.Array.BestTimeToBuyAndSellStockII;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 *
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 *
 * Example 1:
 *
 * Input: [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 *              Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 * Example 2:
 *
 * Input: [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 *              Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
 *              engaging multiple transactions at the same time. You must sell before buying again.
 * Example 3:
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */

public class BestTimeToBuyAndSellStockII_BestPractice {
    public int solution(int[] prices) {
        int total = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            // 현재 숫자의 값이 전 숫자의 값 보다 큰 경우
            if (prices[i+1] > prices[i]) {
                // 누적 이득값에 현재 숫자에서 이전 숫자를 뺀 값을 더함
                // -> 숫자가 커질 때 그 차이만 저장 (카데인 알고리즘)
                total += prices[i + 1] - prices[i];
            }
        }
        return total;
    }
}

/**
 * 키워드 - 카데인 알고리즘(Kadane's Algorithm)
 */