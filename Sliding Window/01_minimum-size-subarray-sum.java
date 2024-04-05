// Sliding Window/01_minimum-size-subarray-sum.java
/**
 * Date  : 05-Apr-24
 * Repo  : https://github.com/ankitsamaddar/leetcode-top-150
 *
 * Problem   :  209. Minimum Size Subarray Sum
 * Difficulty:  🟡Medium
 *
 * Leetcode 0209 :  https://leetcode.com/problems/minimum-size-subarray-sum
 * Lintcode 0406 :  https://www.lintcode.com/problem/406
 */

class Solution {
  public int minSubArrayLen(int target, int[] nums) {
    int left  = 0;
    int right = 0;
    int sum   = 0;
    int ans   = Integer.MAX_VALUE;

    while (right < nums.length) {
      sum += nums[right];
      // if sum was more than or equals to target
      // save the window length and increment from left
      while (sum >= target) {
        // ans is the length of current window
        ans = Math.min(ans, right - left + 1);
        // remove left element from sum and increment left
        sum -= nums[left];
        left++;
      }
      // increment right
      right++;
    }
    // If no window with sum >= target found return 0,
    // else return ans
    return ans == Integer.MAX_VALUE ? 0 : ans;
  }
}
