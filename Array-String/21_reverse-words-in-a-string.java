// Array-String/21_reverse-words-in-a-string.java
/**
 * Date  : 04-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  151. Reverse Words in a String
 * Difficulty:  🟡Medium
 *
 * Leetcode 0151 :  https://leetcode.com/problems/reverse-words-in-a-string
 * Lintcode 0053 :  https://www.lintcode.com/problem/53
 */

class Solution {
  public String reverseWords(String s) {
    // Split the strings to words array
    String[] words = s.trim().split("\\s+");

    StringBuilder result = new StringBuilder();
    // append the words in reverse to result
    for (int i = words.length - 1; i >= 0; i--) {
      result.append(words[i]);
      if (i > 0) {
        result.append(" ");
      }
    }
    // return the result
    return result.toString();
  }
}

/*

// solution 2 - using while loop - beats 96.06%
class Solution {
  public String reverseWords(String s) {
    s = s.trim(); // remove leading and trailing spaces

    StringBuilder result = new StringBuilder();

    int i = s.length() - 1;
    int j = s.length();

    // iterate from the end
    while (i >= 0) {
      // set the end of a word
      // skip spaces
      if (s.charAt(i) == ' ') {
        j = i;
      }
      // if i-th index is start of a word
      // add word(from i to j) to result
      else if (i == 0 || s.charAt(i - 1) == ' ') {
        // if a word already exists add ' '
        if (result.length() != 0) {
          result.append(' ');
        }
        result.append(s.substring(i, j));
      }
      // go to next character
      i--;
    }
    return result.toString();
  }
}

*/
