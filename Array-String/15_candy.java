// Array-String/15_candy.java
/**
 * Date  : 03-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  135. Candy
 * Difficulty:  🔴Hard
 *
 * Leetcode 0135 :  https://leetcode.com/problems/candy
 * Lintcode 0412 :  https://www.lintcode.com/problem/412
 */

import java.util.*;

class Solution {
  public int candy(int[] ratings) {
    // number of students
    int n = ratings.length;

    int[] left  = new int[n];
    int[] right = new int[n];

    // Each students should have atleast 1 candy
    Arrays.fill(left, 1);
    Arrays.fill(right, 1);

    // traverse from left
    // if current student rating higher than previous
    // gets 1 more candy than previous
    for (int i = 1; i < n; i++) {
      if (ratings[i] > ratings[i - 1]) {
        left[i] = left[i - 1] + 1;
      }
    }

    // traverse from right
    // if current student rating higher than next
    // get 1 more candy than next
    for (int i = n - 2; i >= 0; i--) {
      if (ratings[i] > ratings[i + 1]) {
        right[i] = right[i + 1] + 1;
      }
    }

    int totalCandies = 0;

    // total candies is the sum of maximum candies a child can get
    for (int i = 0; i < n; i++) {
      totalCandies += Math.max(left[i], right[i]);
    }

    return totalCandies;
  }
}
