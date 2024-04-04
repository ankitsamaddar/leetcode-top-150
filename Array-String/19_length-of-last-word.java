// Array-String/19_length-of-last-word.java
/**
 * Date  : 04-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  58. Length of Last Word
 * Difficulty:  🟢Easy
 *
 * Leetcode 0058 :  https://leetcode.com/problems/length-of-last-word
 * Lintcode 0422 :  https://www.lintcode.com/problem/422
 */

class Solution {
  public int lengthOfLastWord(String s) {
    int len = 0;
    // iterate string from the end
    for (int i = s.length() - 1; i > -1; i--) {
      // if the string is not ' ' increase len
      if (s.charAt(i) != ' ') {
        len++;
      }
      // if ' ' is found, and len is not 0, break the loop, as last word is already counted
      else if (len != 0) {
        break;
      }
    }
    // return length of last word
    return len;
  }
}
