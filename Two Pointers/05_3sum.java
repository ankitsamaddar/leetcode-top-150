// Two Pointers/05_3sum.java
/**
 * Date  : 04-Apr-24
 * Repo  : https://github.com/ankitsamaddar/leetcode-top-150
 *
 * Problem   :  15. 3Sum
 * Difficulty:  🟡Medium
 *
 * Leetcode 0015 :  https://leetcode.com/problems/3sum
 * Lintcode 0057 :  https://www.lintcode.com/problem/57
 */

import java.util.*;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);

    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      // skip duplicates
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      int left  = i + 1;
      int right = nums.length - 1;
      while (left < right) {
        int threeSum = nums[i] + nums[left] + nums[right];

        if (threeSum > 0) {
          right--;
        } else if (threeSum < 0) {
          left++;
        }
        // threeSum is 0, so valid 3sum
        else {
          result.add(Arrays.asList(nums[i], nums[left], nums[right]));
          left++;
          // skip duplicates
          while (left < right && nums[left] == nums[left - 1]) {
            left++;
          }
        }
      }
    }
    return result;
  }
}
