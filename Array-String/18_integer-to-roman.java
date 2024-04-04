// Array-String/18_integer-to-roman.java
/**
 * Date  : 04-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  12. Integer to Roman
 * Difficulty:  🟡Medium
 *
 * Leetcode 0012 :  https://leetcode.com/problems/integer-to-roman
 * Lintcode 0418 :  https://www.lintcode.com/problem/418
 */

class Solution {
  public String intToRoman(int num) {
    String[] ones      = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    String[] tens      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] hundreds  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String[] thousands = {"", "M", "MM", "MMM"};

    StringBuilder roman = new StringBuilder();
    // append the number places to Roman numerals
    roman.append(thousands[num / 1000]);
    roman.append(hundreds[(num % 1000) / 100]);
    roman.append(tens[(num % 100) / 10]);
    roman.append(ones[num % 10]);

    return roman.toString();
  }
}
