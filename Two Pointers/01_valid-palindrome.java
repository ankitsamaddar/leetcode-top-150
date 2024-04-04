// Two Pointers/01_valid-palindrome.java
/**
 * Date  : 04-Apr-24
 * Repo  : https://github.com/ankitsamaddar/leetcode-top-150
 *
 * Problem   :  125. Valid Palindrome
 * Difficulty:  🟢Easy
 *
 * Leetcode 0125 :  https://leetcode.com/problems/valid-palindrome
 * Lintcode 0415 :  https://www.lintcode.com/problem/415
 */

import java.util.*;

class Solution {
  public boolean isPalindrome(String s) {
    int start = 0;
    int end   = s.length() - 1;

    while (start < end) {
      // move pointer if not alphanumeric
      if (!Character.isLetterOrDigit(s.charAt(start))) {
        start++;
        continue;
      }
      // move pointer if not alphanumeric
      else if (!Character.isLetterOrDigit(s.charAt(end))) {
        end--;
        continue;
      }
      // check if characters at start and end match, if not, return false
      else {
        if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
          // not palindrome
          return false;
        }
      }

      // increment pointers
      start++;
      end--;
    }
    // is palindrome
    return true;
  }
}
