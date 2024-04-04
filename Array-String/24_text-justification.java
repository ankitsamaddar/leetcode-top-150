// Array-String/24_text-justification.java
/**
 * Date  : 04-Apr-24
 * Repo  : https://github.com/ankitsamaddar/leetcode-top-150
 *
 * Problem   :  68. Text Justification
 * Difficulty:  🔴Hard
 *
 * Leetcode 0068 :  https://leetcode.com/problems/text-justification
 * Lintcode 1361 :  https://www.lintcode.com/problem/1361
 */

import java.util.*;

class Solution {
  public List<String> fullJustify(String[] words, int maxWidth) {
    List<String> result = new ArrayList<>();
    int n               = words.length;
    // add the words in the current line
    for (int i = 0; i < n;) {
      List<String> currentLineWords = new ArrayList<>();
      currentLineWords.add(words[i]);            // add the current word
      int currentLineLength = words[i].length(); // add current word length to current line length
      i++;                                       // go to next word

      // add words to the list till <= maxWidth
      while (i < n && (currentLineLength + 1 + words[i].length()) <= maxWidth) {
        currentLineLength += 1 + words[i].length();
        currentLineWords.add(words[i]);
        i++; // go to next word
      }

      // left justify if last word in words or only one word
      if (i == n || currentLineWords.size() == 1) {
        StringBuilder line = new StringBuilder();
        // leftJustify
        line.append(String.join(" ", currentLineWords));
        // rightPadding
        line.append(" ".repeat(maxWidth - line.length()));
        // add to the result
        result.add(line.toString());
        continue; // to next iteration
      }

      // Calculate spaces needed to reach maxWidth for padding
      int totalSpaces  = maxWidth - (currentLineLength - currentLineWords.size() + 1);
      int spacesPerGap = totalSpaces / (currentLineWords.size() - 1); // leaving last word
      int extraSpaces  = totalSpaces % (currentLineWords.size() - 1); 

      // Build the justified line
      StringBuilder line = new StringBuilder();
      for (int j = 0; j < currentLineWords.size() - 1; j++) {
        line.append(currentLineWords.get(j));
        line.append(" ".repeat(spacesPerGap + (j < extraSpaces ? 1 : 0)));
      }
      // add last word
      line.append(currentLineWords.get(currentLineWords.size() - 1));

      // add current line to result
      result.add(line.toString());
    }

    return result;
  }
}
