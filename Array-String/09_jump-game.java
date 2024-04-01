// Array-String/09_jump-game.java
/**
 * Date  : 02-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  55. Jump Game
 * Difficulty:  🟡Medium
 *
 * Leetcode 0055 :  https://leetcode.com/problems/jump-game
 * Lintcode 0116 :  https://www.lintcode.com/problem/116
 */

class Solution {
    public boolean canJump(int[] nums) {

      int jump = 0;
      // iterate till i<=jump
      for(int i=0;i<nums.length && i<=jump;i++) {

        jump = Math.max(jump,i+nums[i]);
      }
      // if all indices reachable
      return jump >= nums.length-1;

    }
}
