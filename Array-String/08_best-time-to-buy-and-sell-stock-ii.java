// Array-String/08_best-time-to-buy-and-sell-stock-ii.java
/**
 * Date  : 01-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  122. Best Time to Buy and Sell Stock II
 * Difficulty:  🟡Medium
 *
 * Leetcode 0122 :  https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii
 * Lintcode 0150 :  https://www.lintcode.com/problem/150
 */

class Solution {
    public int maxProfit(int[] prices) {
      int maxProfit = 0;

      for(int i=1;i<prices.length;i++) {
        // maxProfit is sum of all increases in the stock price from the previous price
        // as we can sell immediately when price goes up and buy again when same or price goes down
        if(prices[i]>prices[i-1]) {
          maxProfit += prices[i] - prices[i-1];
        }
      }

      return maxProfit;
    }
}
