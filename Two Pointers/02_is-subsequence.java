// Two Pointers/02_is-subsequence.java
/**
 * Date  : 04-Apr-24
 * Repo  : https://github.com/ankitsamaddar/leetcode-top-150
 *
 * Problem   :  392. Is Subsequence
 * Difficulty:  🟢Easy
 *
 * Leetcode 0392 :  https://leetcode.com/problems/is-subsequence
 * Lintcode 1263 :  https://www.lintcode.com/problem/1263
 */

class Solution {
  public boolean isSubsequence(String s, String t) {
    // s is empty
    if (s.length() == 0) {
      return true;
    }

    int ptrS = 0;
    int ptrT = 0;

    while (ptrT < t.length()) {
      if (t.charAt(ptrT) == s.charAt(ptrS)) {
        ptrS++; // increment s pointer
        // full string s already found
        if (ptrS == s.length()) {
          return true;
        }
      }
      ptrT++; // increment t pointer
    }
    // not found
    return false;
  }
}
