// Array-String/02_remove-element.java
/**
 * Date  : 01-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  27. Remove Element
 * Difficulty:  🟢Easy
 *
 * Leetcode 0027 :  https://leetcode.com/problems/remove-element
 * Lintcode 0172 :  https://www.lintcode.com/problem/172
 */

import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
    int i = 0;
    // iterate the array and if the element is not equals to val, add it to i index, increment the index i.
    for(int j=0;j<nums.length;j++) {
      if(nums[j]!=val){
        nums[i++] = nums[j];
      }
    }
    return i;
    }
}
