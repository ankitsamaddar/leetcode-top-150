// Array-String/16_trapping-rain-water.java
/**
 * Date  : 04-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  42. Trapping Rain Water
 * Difficulty:  🔴Hard
 *
 * Leetcode 0042 :  https://leetcode.com/problems/trapping-rain-water
 * Lintcode 0363 :  https://www.lintcode.com/problem/363
 */

class Solution {
  public int trap(int[] height) {
    int left     = 0;
    int right    = height.length - 1;
    int maxLeft  = 0;
    int maxRight = 0;

    int totalWater = 0;

    while (left < right) {
      // Update max height on both side
      maxLeft  = Math.max(maxLeft, height[left]);
      maxRight = Math.max(maxRight, height[right]);

      // if maxLeft is < maxRight
      // current empty height = maxLeft - height[left]
      // add current empty height to totalWater
      if (maxLeft < maxRight) {
        totalWater += maxLeft - height[left];
        left++;
      }
      // if maxRight is < maxLeft
      // current empty height = maxRight - height[right]
      // add current empty height to totalWater
      else {
        totalWater += maxRight - height[right];
        right--;
      }
    }

    return totalWater;
  }
}
