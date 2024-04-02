// Array-String/13_product-of-array-except-self.java
/**
 * Date  : 02-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  238. Product of Array Except Self
 * Difficulty:  🟡Medium
 *
 * Leetcode 0238 :  https://leetcode.com/problems/product-of-array-except-self
 * Lintcode 1310 :  https://www.lintcode.com/problem/1310
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {

      int[] res = new int[nums.length];

    // Prefix product
    // product of all numbers before the current number (all numbers in the left)
      int prefix = 1;
      for(int i=0;i<nums.length;i++) {
      res[i] = prefix;
      prefix = prefix * nums[i];
      }

    // Postfix product - from the end
    // product of all numbers after the current number (all numbers in the right)
    int postfix = 1;
    for(int i=nums.length-1;i>=0;i--) {
      res[i] = res[i] * postfix;
      postfix = postfix * nums[i];
    }
    // product of all number except current number
    return res;
  }
}
