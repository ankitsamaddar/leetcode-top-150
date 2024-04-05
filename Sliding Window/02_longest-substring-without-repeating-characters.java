// Sliding Window/02_longest-substring-without-repeating-characters.java
/**
 * Date  : 05-Apr-24
 * Repo  : https://github.com/ankitsamaddar/leetcode-top-150
 *
 * Problem   :  3. Longest Substring Without Repeating Characters
 * Difficulty:  🟡Medium
 *
 * Leetcode 0003 :  https://leetcode.com/problems/longest-substring-without-repeating-characters
 * Lintcode 0384 :  https://www.lintcode.com/problem/384
 */

class Solution {
  public int lengthOfLongestSubstring(String s) {
    int left   = 0;
    int right  = 0;
    int ans    = 0;
    char[] str = s.toCharArray();

    HashSet<Character> unique = new HashSet<>();

    while (right < str.length) {
      // not present so save window length to ans
      // shrink from left
      if (!unique.contains(str[right])) {
        unique.add(str[right]);
        right++;
        ans = Math.max(ans, right - left);
      }
      // if already present shrink window from left
      else {
        unique.remove(str[left]);
        left++;
      }
    }

    return ans;
  }
}
