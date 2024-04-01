// Array-String/06_rotate-array.java
/**
 * Date  : 01-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  189. Rotate Array
 * Difficulty:  🟡Medium
 *
 * Leetcode 0189 :  https://leetcode.com/problems/rotate-array
 * Lintcode 1334 :  https://www.lintcode.com/problem/1334
 */

class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length; // adjust k to nums length
        int n = nums.length -1;
        // reverse whole array
        reverse(nums,0,n);
        // reverse first k elements
        reverse(nums,0,k-1);
        // reverse rest of the elements
        reverse(nums,k,n);
    }

    private void reverse(int[] nums, int start, int end) {
      while(start<end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
      }
    }
}
