// Array-String/10_jump-game-ii.java
/**
 * Date  : 02-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  45. Jump Game II
 * Difficulty:  🟡Medium
 *
 * Leetcode 0045 :  https://leetcode.com/problems/jump-game-ii
 * Lintcode 0117 :  https://www.lintcode.com/problem/117
 */

class Solution {
    public int jump(int[] nums) {

      if (nums.length<=1) {
        return 0;
      }
      int curJump=nums[0]; // track current jump
      int maxJump = nums[0]; // track farthest jump
      int jump = 1; // count jumps

      // iterate till second last element
      for(int i = 0;i<nums.length - 1;i++){
        maxJump = Math.max(maxJump,i+nums[i]);
        // if current jump reached
        // update to maxJump and increment jumps
        if(i==curJump) {
          jump++;
          curJump = maxJump;
        }
      }
      return jump;
    }
}
