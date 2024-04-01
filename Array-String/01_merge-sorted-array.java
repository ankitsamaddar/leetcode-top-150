// Array-String/01_merge-sorted-array.java
/**
 * Date  : 01-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  88. Merge Sorted Array
 * Difficulty:  🟢Easy
 *
 * Leetcode 0088 :  https://leetcode.com/problems/merge-sorted-array
 * Lintcode 0000 :  —
 */

import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // k is the length of the merged array
        int i = m-1, j = n-1, k = m+n -1;

        // iterate from the end
        while(i>= 0 && j>=0) {
            // nums1 > nums2
            if(nums1[i]>nums2[j]) {
                nums1[k--] = nums1[i--];
            }
            // nums2 > nums1
            else {
                nums1[k--] = nums2[j--];
            }
        }
        // if elements left in nums2
        while(j>=0) {
            nums1[k--] = nums2[j--];
        }
    }
}
