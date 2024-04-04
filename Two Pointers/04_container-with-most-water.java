// Two Pointers/04_container-with-most-water.java
/**
 * Date  : 04-Apr-24
 * Repo  : https://github.com/ankitsamaddar/leetcode-top-150
 *
 * Problem   :  11. Container With Most Water
 * Difficulty:  🟡Medium
 *
 * Leetcode 0011 :  https://leetcode.com/problems/container-with-most-water
 * Lintcode 0383 :  https://www.lintcode.com/problem/383
 */

class Solution {
  public int maxArea(int[] height) {
    int maxArea = 0;

    int left  = 0;
    int right = height.length - 1;

    while (left < right) {
      int length  = right - left;
      int breadth = Math.min(height[left], height[right]);

      // Calculate and update maxArea
      int area = length * breadth;
      maxArea  = Math.max(maxArea, area);

      // if height in the left is less than breadth move right
      while (left < right && height[left] <= breadth) {
        left++;
      }
      // if height in the right is less than breadth move left
      while (left < right && height[right] <= breadth) {
        right--;
      }
    }

    return maxArea;
  }
}
