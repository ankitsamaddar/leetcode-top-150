# leetcode-top-150

This repository contains solutions of coding problems for interviews.

The README, problem details, and solutions are updated using a PowerShell script.

| SL No | Problem Name w/ Difficulty | Leetcode | Lintcode | Solution | Notes |
| :---: | -------------------------- | :------: | :------: | :------: | ----- |
| 01 | 88. Merge Sorted Array <br>🟢Easy | [88](https://leetcode.com/problems/merge-sorted-array) | —  | 01-Apr-24<br>[Java](<./Array-String/01_merge-sorted-array.java>) | Set k as the new length of the merged array. Iterate the array from the end, if nums1[i]>nums2[j] add nums1[i] to kth index in nums1, reduce index i, k. Else add nums[j] to kth index and reduce index j, k. If elements still in nums2, iterate and add to kth index, reduce j,k.  |
