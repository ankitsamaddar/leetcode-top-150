# leetcode-top-150

This repository contains solutions of coding problems for interviews.

The README, problem details, and solutions are updated using a PowerShell script.

## Array/String

| SL No | Problem Name w/ Difficulty | Leetcode | Lintcode | Solution | Notes |
| :---: | -------------------------- | :------: | :------: | :------: | ----- |
| 01 | 88. Merge Sorted Array <br>🟢Easy | [88](https://leetcode.com/problems/merge-sorted-array) | —  | 01-Apr-24<br>[Java](<./Array-String/01_merge-sorted-array.java>) | Set k as the new length of the merged array. Iterate the array from the end, if nums1[i]>nums2[j] add nums1[i] to kth index in nums1, reduce index i, k. Else add nums[j] to kth index and reduce index j, k. If elements still in nums2, iterate and add to kth index, reduce j,k.  |
| 02 | 27. Remove Element <br>🟢Easy | [27](https://leetcode.com/problems/remove-element) | [172](https://www.lintcode.com/problem/172)  | 01-Apr-24<br>[Java](<./Array-String/02_remove-element.java>) | Initialize index i=0, iterate the array and if the element is not equals to val, add it to i index, increment the index i. Return i. |
| 03 | 26. Remove Duplicates from Sorted Array <br>🟢Easy | [26](https://leetcode.com/problems/remove-duplicates-from-sorted-array) | 🔒 [100](https://www.lintcode.com/problem/100)  | 01-Apr-24<br>[Java](<./Array-String/03_remove-duplicates-from-sorted-array.java>) | Set an index len=0 and iterate the array from index 1, if the current element is not equal to element at len, increment len and set it as element at len. Return len. |
| 04 | 80. Remove Duplicates from Sorted Array II <br>🟡Medium | [80](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii) | [101](https://www.lintcode.com/problem/101)  | 01-Apr-24<br>[Java](<./Array-String/04_remove-duplicates-from-sorted-array-ii.java>) | Initialize len, iterate the array, if len<2 or if current element greater than previous two elements in the modified array, add it and increment len. Return len. |
| 05 | 169. Majority Element <br>🟢Easy | [169](https://leetcode.com/problems/majority-element) | [46](https://www.lintcode.com/problem/46)  | 01-Apr-24<br>[Java](<./Array-String/05_majority-element.java>) | Iterate the array, if count is 0, set the current element as majority. If current element==majority increment count, else decrement it. Return majority. |
| 06 | 189. Rotate Array <br>🟡Medium | [189](https://leetcode.com/problems/rotate-array) | [1334](https://www.lintcode.com/problem/1334)  | 01-Apr-24<br>[Java](<./Array-String/06_rotate-array.java>) | Adjust k to the length of the array, reverse the whole array, then reverse the first k element, and then reverse the rest of the array. |
