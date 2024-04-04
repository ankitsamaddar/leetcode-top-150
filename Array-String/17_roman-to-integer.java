// Array-String/17_roman-to-integer.java
/**
 * Date  : 04-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  13. Roman to Integer
 * Difficulty:  🟢Easy
 *
 * Leetcode 0013 :  https://leetcode.com/problems/roman-to-integer
 * Lintcode 0419 :  https://www.lintcode.com/problem/419
 */

import java.util.*;

/* SLOWER using HashMap
class Solution {
  public int romanToInt(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    int result = 0;
    int len    = s.length() - 1;

    // iterating from the end
    for (int i = len; i >= 0; i--) {
      // subtract if numeral less than right numeral
      // Eg: IV = 4 = V - I = 5 - 1
      if (i < len && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
        result -= map.get(s.charAt(i));
      }
      // else add the numeral
      else {
        result += map.get(s.charAt(i));
      }
    }

    return result;
  }
}
*/

// Faster using switch case
class Solution {
  public int romanToInt(String s) {
    int result = 0;
    int val    = 0;
    // iterate from the end
    for (int i = s.length() - 1; i >= 0; i--) {
      // using switch case to get the value of the numeral
      switch (s.charAt(i)) {
        case 'I':
          val = 1;
          break;
        case 'V':
          val = 5;
          break;
        case 'X':
          val = 10;
          break;
        case 'L':
          val = 50;
          break;
        case 'C':
          val = 100;
          break;
        case 'D':
          val = 500;
          break;
        case 'M':
          val = 1000;
          break;
        default:
          val = 0;
      }
      // a smaller numeral appears before a larger one
      // only when the smaller numeral is 1/5th or 1/10th of the larger numeral.
      // Eg: IV = 4, IX = 9
      // so it should be subtracted
      if (4 * val < result) {
        result -= val;
      } else {
        result += val;
      }
    }
    return result;
  }
}
