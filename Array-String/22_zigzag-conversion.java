// Array-String/22_zigzag-conversion.java
/**
 * Date  : 04-Apr-24
 * Repo  : https://github.com/ankitsamaddar/leetcode-top-150
 *
 * Problem   :  6. Zigzag Conversion
 * Difficulty:  🟡Medium
 *
 * Leetcode 0006 :  https://leetcode.com/problems/zigzag-conversion
 * Lintcode 1363 :  https://www.lintcode.com/problem/1363
 */

class Solution {
  public String convert(String s, int numRows) {
    // no need to zigzag
    if (numRows == 1) {
      return s;
    }

    // Initialize an array of StringBuilders
    StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())];
    for (int i = 0; i < rows.length; i++) {
      rows[i] = new StringBuilder();
    }

    int curRow        = 0;
    boolean goingDown = false;

    for (char c : s.toCharArray()) {
      // add current character
      rows[curRow].append(c);
      // change direction if at top or bottom
      if (curRow == 0 || curRow == numRows - 1) {
        goingDown = !goingDown;
      }
      // set row according to direction
      // if goingDown add 1 else -1
      curRow += goingDown ? 1 : -1;
    }

    StringBuilder result = new StringBuilder();
    // append each row to a string
    for (var row : rows) {
      result.append(row);
    }

    return result.toString();
  }
}
