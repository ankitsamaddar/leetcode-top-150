// Sliding Window/03_substring-with-concatenation-of-all-words.java
/**
 * Date  : 05-Apr-24
 * Repo  : https://github.com/ankitsamaddar/leetcode-top-150
 *
 * Problem   :  30. Substring with Concatenation of All Words
 * Difficulty:  🔴Hard
 *
 * Leetcode 0030 :  https://leetcode.com/problems/substring-with-concatenation-of-all-words
 * Lintcode 1362 :  https://www.lintcode.com/problem/1362
 */

import java.util.*;

class Solution {
  public List<Integer> findSubstring(String s, String[] words) {
    List<Integer> result = new ArrayList<>(); // initialize result list

    // return empty list if words and s empty
    if (words.length == 0 || s.length() == 0) {
      return result;
    }

    // use a map to count frequency of each word
    Map<String, Integer> wordCount = new HashMap<>();
    for (String word : words) {
      wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
    }

    int wordNum = words.length;      // total number of words
    int wordLen = words[0].length(); // length of each word

    // Loop through string, the substring can start from any index till wordLen
    for (int i = 0; i < wordLen; i++) {
      int left  = i;
      int right = i;
      int count = 0;
      // create map to count freq of each word
      Map<String, Integer> currentCount = new HashMap<>();

      // sliding window of wordLen till end of string
      while (right + wordLen <= s.length()) {
        String w = s.substring(right, right + wordLen);
        right += wordLen; // increment right

        // if current word not in words, move left = right and clear current map
        if (!wordCount.containsKey(w)) {
          count = 0;
          left  = right;
          currentCount.clear(); // clear current word map
        }

        // else increase current word count in map, increment count
        else {
          currentCount.put(w, currentCount.getOrDefault(w, 0) + 1);
          count++;

          // if current word count more than total word count
          // remove word from the left and increment left
          // decrease count and also remove current word count from map
          while (currentCount.getOrDefault(w, 0) > wordCount.getOrDefault(w, 0)) {
            String t = s.substring(left, left + wordLen);
            count--;
            currentCount.put(t, currentCount.getOrDefault(t, 0) - 1);
            left += wordLen;
          }

          // if all words matched, add left pointer to result
          if (count == wordNum) {
            result.add(left);
          }
        }
      }
    }
    return result;
  }
}
