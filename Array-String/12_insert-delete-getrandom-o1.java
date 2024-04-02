// Array-String/12_insert-delete-getrandom-o1.java
/**
 * Date  : 02-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  380. Insert Delete GetRandom O(1)
 * Difficulty:  🟡Medium
 *
 * Leetcode 0380 :  https://leetcode.com/problems/insert-delete-getrandom-o1
 * Lintcode 0657 :  https://www.lintcode.com/problem/657
 */

import java.util.*;

class RandomizedSet {

  HashMap<Integer, Integer> map; // store value of index
  ArrayList<Integer> list; // value set
  Random rand; // random object
  // initialize the constructor
  public RandomizedSet() {
    map = new HashMap<>();
    list = new ArrayList<>();
    rand = new Random();
  }
  // insert element if not present and return true or false
  // store the index in map
  public boolean insert(int val) {
      if(map.containsKey(val)) {
        return false;
      }
      map.put(val,list.size()); // map to store the index of the current value
      list.add(val);
      return true;
  }
  // remove element if present
  // get the index of val. Get last element from list. Set index as last element in the list. Remove last element from list.
  // update the last element index in map, remove val from map
  public boolean remove(int val) {
      if(!map.containsKey(val)) {
        return false;
      }
      int index = map.get(val); // get index
      // get the last element and set at index of val
      int lastElement = list.get(list.size()-1);
      list.set(index, lastElement);
      // update index of the last element
      map.put(lastElement, index);
      // remove the last element from set
      list.remove(list.size()-1);
      // remove the val key from map
      map.remove(val);

      return true;
  }
  // get a random element from the set
  public int getRandom() {
      // get random element within the size of the list
      return list.get(rand.nextInt(list.size()));
  }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
