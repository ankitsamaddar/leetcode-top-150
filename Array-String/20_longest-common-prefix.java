// Array-String/20_longest-common-prefix.java
/**
 * Date  : 04-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  14. Longest Common Prefix
 * Difficulty:  🟢Easy
 *
 * Leetcode 0014 :  https://leetcode.com/problems/longest-common-prefix
 * Lintcode 0078 :  https://www.lintcode.com/problem/78
 */

class Solution {
  public String longestCommonPrefix(String[] strs) {
    // empty array
    if (strs.length == 0) {
      return "";
    }
    // set prefix as the first words
    StringBuilder prefix = new StringBuilder(strs[0]);
    // iterate from the second word
    for (int i = 1; i < strs.length; i++) {
      // till the current word does begins with prefix, remove one character from the end of prefix
      while (strs[i].indexOf(prefix.toString()) != 0) {
        // remove last character
        prefix.deleteCharAt(prefix.length() - 1);
        // if the prefix becomes empty
        if (prefix.length() == 0) {
          return "";
        }
      }
    }

    return prefix.toString();
  }
}
