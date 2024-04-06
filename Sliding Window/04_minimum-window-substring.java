// Sliding Window/04_minimum-window-substring.java
/**
 * Date  : 06-Apr-24
 * Repo  : https://github.com/ankitsamaddar/leetcode-top-150
 *
 * Problem   :  76. Minimum Window Substring
 * Difficulty:  🔴Hard
 *
 * Leetcode 0076 :  https://leetcode.com/problems/minimum-window-substring
 * Lintcode 0032 :  https://www.lintcode.com/problem/32
 */

class Solution {
  public String minWindow(String s, String t) {
    int[] countT      = new int[128];
    int[] windowCount = new int[128];

    int have = 0;
    int need = 0;

    // count frequency of each character
    for (char c : t.toCharArray()) {
      countT[c]++;
    }

    // count unique characters
    for (int i = 0; i < 128; i++) {
      if (countT[i] > 0) {
        need++;
      }
    }

    int resIndex = -1;
    int resLen   = Integer.MAX_VALUE;

    // sliding window
    int left  = 0;
    int right = 0;
    for (; right < s.length(); right++) {
      char c = s.charAt(right);

      windowCount[c]++;

      if (countT[c] != 0 && windowCount[c] == countT[c]) {
        have++;
      }

      // current window contains all unique characters
      while (have == need) {
        // window less than previous
        if (right - left + 1 < resLen) {
          resIndex = left;
          resLen   = right - left + 1;
        }

        // increase left pointer count, remove from window, decrease have it was a unique character
        windowCount[s.charAt(left)]--;
        if (countT[s.charAt(left)] != 0 && windowCount[s.charAt(left)] < countT[s.charAt(left)]) {
          have--;
        }

        left++;
      }
    }
    return resLen != Integer.MAX_VALUE ? s.substring(resIndex, resIndex + resLen) : "";
  }
}
