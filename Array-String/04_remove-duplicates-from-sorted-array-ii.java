// Array-String/04_remove-duplicates-from-sorted-array-ii.java
/**
 * Date  : 01-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  80. Remove Duplicates from Sorted Array II
 * Difficulty:  🟡Medium
 *
 * Leetcode 0080 :  https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii
 * Lintcode 0101 :  https://www.lintcode.com/problem/101
 */

import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        int len = 0;

        for(int num : nums ){
          if( // first two elements will stay regardless
            len < 2 ||
          // current number greater than 2 places before in modified array, as two duplicates allowed
          num > nums[len-2]) {
            nums[len++] = num;
          }
        }
        return len;
    }
}
