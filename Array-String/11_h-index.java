// Array-String/11_h-index.java
/**
 * Date  : 02-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  274. H-Index
 * Difficulty:  🟡Medium
 *
 * Leetcode 0274 :  https://leetcode.com/problems/h-index
 * Lintcode 1304 :  https://www.lintcode.com/problem/1304
 */

//  h-index is the largest number h such that there are h papers each with at least h citations

/* O(nlogn) Complexity
class Solution {
    public int hIndex(int[] citations) {
      Arrays.sort(citations); // sort in ascending
      int n = citations.length;

      for(int i=0;i<n;i++) {
        // if i-th paper has atleast n-i citations
        // as sorted, then there are n-i papers with atleast n-i citations
        if(citations[i]>=n-i) {
          return n-i;
        }
      }

      return 0;
    }
}
*/

// O(n) complexity
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;

        int[] count = new int[n+1];

        for(int num : citations) {
          // count citations, if it is more than n, we count it as n
          // as h-index cannot be greater than n
          count[Math.min(n,num)] += 1;
        }

        int sumCount = 0; // count of paper with atleast i citations

        for(int i =n;i>=0;i--) {
          sumCount += count[i];
          // there are i papers with atleast i citations
          // return the h-index
          if(sumCount>=i) {
            return i;
          }
        }

        return 0;
    }
}
