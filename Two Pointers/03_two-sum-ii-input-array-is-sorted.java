// Two Pointers/03_two-sum-ii-input-array-is-sorted.java
/**
 * Date  : 04-Apr-24
 * Repo  : https://github.com/ankitsamaddar/leetcode-top-150
 *
 * Problem   :  167. Two Sum II - Input Array Is Sorted
 * Difficulty:  🟡Medium
 *
 * Leetcode 0167 :  https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
 * Lintcode 0608 :  🔒 https://www.lintcode.com/problem/608
 */

class Solution {
  public int[] twoSum(int[] numbers, int target) {
    int start = 0;
    int end   = numbers.length - 1;

    while (start < end) {
      int sum = numbers[start] + numbers[end];
      // sum found
      if (sum == target) {
        return new int[] {start + 1, end + 1};
      }
      // sum is less than target so increment start pointer
      else if (sum < target) {
        start++;
      } else {
        end--;
      }
    }
    // no sum found
    return new int[] {-1, -1};
  }
}
