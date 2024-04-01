// Array-String/05_majority-element.java
/**
 * Date  : 01-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  169. Majority Element
 * Difficulty:  🟢Easy
 *
 * Leetcode 0169 :  https://leetcode.com/problems/majority-element
 * Lintcode 0046 :  https://www.lintcode.com/problem/46
 */

import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0]; // set first element as majority
        int count = 0;

        for(int num : nums) {
          // if count is 0 set current element as majority
          if(count==0) {
            majority = num;
          }

          // increment/decrement count,
          // if current element is not majority
          if(num == majority) {
            count++;
          }
          else {
            count--;
          }
        }
        // majority element
        return majority;
    }
}
