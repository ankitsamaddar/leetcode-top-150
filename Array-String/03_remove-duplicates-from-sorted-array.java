// Array-String/03_remove-duplicates-from-sorted-array.java
/**
 * Date  : 01-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  26. Remove Duplicates from Sorted Array
 * Difficulty:  🟢Easy
 *
 * Leetcode 0026 :  https://leetcode.com/problems/remove-duplicates-from-sorted-array
 * Lintcode 0100 :  🔒 https://www.lintcode.com/problem/100
 */

import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length ==0 ) {
          return 0;
        }

        int len = 0;
        // iterate from the second element
        for(int j=1;j<nums.length;j++) {
          // increment len and add current element to len index
          // this will set the next element only if it is unique, skipping the duplicates
          if(nums[j] != nums[len]) {
            len++;
            nums[len] = nums[j];
          }
        }

        return len+1;
    }
}
