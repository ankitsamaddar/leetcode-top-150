// Array-String/14_gas-station.java
/**
 * Date  : 03-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  134. Gas Station
 * Difficulty:  🟡Medium
 *
 * Leetcode 0134 :  https://leetcode.com/problems/gas-station
 * Lintcode 0187 :  https://www.lintcode.com/problem/187
 */

class Solution {
  public int canCompleteCircuit(int[] gas, int[] cost) {
    int totalStations = gas.length;
    int minGas = 0;
    int tank = 0, start = 0;

    for(int i=0;i<totalStations;i++) {
      // gas left after visiting current station
      tank += gas[i] - cost[i];
      // tank less than minGas, update minGas and also update start
      if(tank<minGas) {
        minGas = tank;
        start = i+1;
      }
    }
    // if tank -ve we cannot complete circuit
    if(tank<0) {
      return -1;
    }
    // if starting index equal to total  stations, we start at 0 index
    // else return start index
    return start==totalStations ? 0 : start;
  }
}
