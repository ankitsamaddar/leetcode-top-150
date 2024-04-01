// Array-String/07_best-time-to-buy-and-sell-stock.java
/**
 * Date  : 01-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  121. Best Time to Buy and Sell Stock
 * Difficulty:  🟢Easy
 *
 * Leetcode 0121 :  https://leetcode.com/problems/best-time-to-buy-and-sell-stock
 * Lintcode 0149 :  https://www.lintcode.com/problem/149
 */

class Solution {
    public int maxProfit(int[] prices) {

      int left = 0, right = 1, maxProfit = 0;

      for(;right<prices.length;right++) {
        // if prices in right is high calculate max profit
        if(prices[left]<prices[right]) {
          int profit = prices[right] - prices[left];
          maxProfit = Math.max(maxProfit,profit);
        }
        // set left = right as it is current lowest
        else {
          left = right;
        }
      }
      return maxProfit;
    }
}
