// Array-String/23_find-the-index-of-the-first-occurrence-in-a-string.java
/**
 * Date  : 04-Apr-24
 * Repo  : https://github.com/ankitsamaddar/leetcode-top-150
 *
 * Problem   :  28. Find the Index of the First Occurrence in a String
 * Difficulty:  🟢Easy
 *
 * Leetcode 0028 :  https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string
 * Lintcode 0000 :  —
 */

class Solution {
  public int strStr(String haystack, String needle) {
    return haystack.indexOf(needle);
  }
}

// Without using indexOf

class Solution {
  public int strStr(String haystack, String needle) {
    if (needle.length() == 0) {
      return -1;
    }

    int m = haystack.length();
    int n = needle.length();

    // iterate haystack
    for (int i = 0; i <= m - n; i++) {
      // if needle found starting at i, return index
      if (haystack.substring(i, i + n).equals(needle)) {
        return i;
      }
    }
    // not found
    return -1;
  }
}
