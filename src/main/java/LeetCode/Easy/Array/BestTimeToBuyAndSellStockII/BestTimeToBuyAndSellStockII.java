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

public class BestTimeToBuyAndSellStockII {
    public int solution(int[] prices) {
        int min = Integer.MAX_VALUE; // 현재 최소값
        int result = 0; // 최종 누적 이득값
        int subResult = 0; // 최종 누적 이득값
        for (int price : prices) {
            // 현재 가격 < 현재 최소값인 경우 -> 큰 숫자에서 작은 숫자로 내려가는 경우
            if (price < min) {

                // 최소값 갱신
                min = price;

                // 누적된 이득값을 최종 누적 이득값에 더함
                result += subResult;

                // 다음 계산을 위해 누적된 이득값 초기화
                subResult = 0;
            }

            // 현재 가격 >= 현재 최소값인 경우 -> 작은 숫자에서 큰 숫자로 올라가는 경우
            else {
                // 현재 이득값
                int currentProfit = price - min;

                // 현재 이득값이 누적 이득값보다 큰 경우 누적 이득값 갱신
                if (currentProfit > subResult) {
                    subResult = currentProfit;
                }

                // 현재 이득값이 누적 이득값보다 같거나 작은 경우
                // -> 큰 숫자에서 작은 숫자로 내려가서 누적 이득값을 저장해야 함, 새로운 페이즈 시작
                else {
                    // 최소값 갱신
                    min = price;

                    // 누적된 이득값을 최종 누적 이득값에 더함
                    result += subResult;

                    // 다음 계산을 위해 누적된 이득값 초기화
                    subResult = 0;
                }

            }

        }

        // 마지막 누적 이득값을 최종 누적 이득값에 더한 값을 리턴
        return result + subResult;
    }
}

/**
 * 키워드 - 카데인 알고리즘(Kadane's Algorithm)
 */