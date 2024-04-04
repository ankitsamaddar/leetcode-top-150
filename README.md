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
| 07 | 121. Best Time to Buy and Sell Stock <br>🟢Easy | [121](https://leetcode.com/problems/best-time-to-buy-and-sell-stock) | [149](https://www.lintcode.com/problem/149)  | 01-Apr-24<br>[Java](<./Array-String/07_best-time-to-buy-and-sell-stock.java>) | Initialize left and right pointers. Iterate the array, if prices[right]>prices[left] calculate maxProfit, else update left=right. Return maxProfit. |
| 08 | 122. Best Time to Buy and Sell Stock II <br>🟡Medium | [122](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii) | [150](https://www.lintcode.com/problem/150)  | 01-Apr-24<br>[Java](<./Array-String/08_best-time-to-buy-and-sell-stock-ii.java>) | Iterate the array and calculate sum of all increases in stock price from the previous in maxProfit. This is because we can sell immediately when price goes up and buy again when same or price goes down. Return maxProfit. |
| 09 | 55. Jump Game <br>🟡Medium | [55](https://leetcode.com/problems/jump-game) | [116](https://www.lintcode.com/problem/116)  | 02-Apr-24<br>[Java](<./Array-String/09_jump-game.java>) | Iterate the array till i<=jump, update jump with i+nums[i]. Return if jump>=nums.length-1 ,i.e can jump to last index. |
| 10 | 45. Jump Game II <br>🟡Medium | [45](https://leetcode.com/problems/jump-game-ii) | [117](https://www.lintcode.com/problem/117)  | 02-Apr-24<br>[Java](<./Array-String/10_jump-game-ii.java>) | Set curJump=maxJump=nums[0]. Iterate the array till the second last element. Calculate the maxJump=i+nums[i]. If i==curJump, increment jump count and update curJump as maxJump. Return jump count. |
| 11 | 274. H-Index <br>🟡Medium | [274](https://leetcode.com/problems/h-index) | [1304](https://www.lintcode.com/problem/1304)  | 02-Apr-24<br>[Java](<./Array-String/11_h-index.java>) | Initialize a count array to count the number of citations. Iterate the array and increase the count(if num>n) set it as n as h-index cannot be more than n. Set a sumCount and iterate the the count array from n to 0, add count[i] to sumCount. If sumCount is >= i, i.e. there are atleast i papers with atleast i citations(h-index). Return i. Outside return 0. |
| 12 | 380. Insert Delete GetRandom O(1) <br>🟡Medium | [380](https://leetcode.com/problems/insert-delete-getrandom-o1) | [657](https://www.lintcode.com/problem/657)  | 02-Apr-24<br>[Java](<./Array-String/12_insert-delete-getrandom-o1.java>) | Declare a map to store the value key w/ index, a list for values and a random variable. Inside the constructor initialize the 3 variable. In `insert(val)` return false if val already present. Else add val to the list and also add the val with index to map. Return true. In `remove(val)` return false if val not present. Else get the index of the val, get the last element from the list, set it at index and also update the last element index in the map. Form list remove the last element and form map remove val. Return true. In `getRandom()` , Generate an random within list.size() and return the element at this index from the list. |
| 13 | 238. Product of Array Except Self <br>🟡Medium | [238](https://leetcode.com/problems/product-of-array-except-self) | [1310](https://www.lintcode.com/problem/1310)  | 02-Apr-24<br>[Java](<./Array-String/13_product-of-array-except-self.java>) | Initialize result array. Calculate prefix product(numbers in the left) in the result array. Iterate result array from the end, do postfix product(numbers in the right) in the result array. Return result array. |
| 14 | 134. Gas Station <br>🟡Medium | [134](https://leetcode.com/problems/gas-station) | [187](https://www.lintcode.com/problem/187)  | 03-Apr-24<br>[Java](<./Array-String/14_gas-station.java>) | totalGasStations is the length of the gas array. Iterate both the array and add to current tank gas[i] - cost[i]. If tank<minGas update minGas and update start as next index. If tank is -ve return -1 as we cannot complete the circuit. If start == totalGasStations return 0 as we start at the first index, else return start.  |
| 15 | 135. Candy <br>🔴Hard | [135](https://leetcode.com/problems/candy) | [412](https://www.lintcode.com/problem/412)  | 03-Apr-24<br>[Java](<./Array-String/15_candy.java>) | We use two arrays left and right to count number of candies for each neighbor. We initialize both with 1 as all students gets atleast 1 candy. For each student if its rating is more than left increment candy count one more than left. Similarly iterate from the right, if candy count more than next increment candy count as 1 more than new. Count the totalCandies by adding max from left and right array for the student. Return totalCandies. |
| 16 | 42. Trapping Rain Water <br>🔴Hard | [42](https://leetcode.com/problems/trapping-rain-water) | [363](https://www.lintcode.com/problem/363)  | 04-Apr-24<br>[Java](<./Array-String/16_trapping-rain-water.java>) | Use two pointer to iterate from both ends, update maxLeft and maxRight height. if maxLeft<maxRight add current empty height from the left to totalWater and increment left. Else add current empty height from right to totalWater and increment right. Return totalWater. |
