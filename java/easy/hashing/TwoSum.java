package java.easy.hashing;
import java.util.*;
/**
 * TWO SUM
 * Level: Easy
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class TwoSum {

    // Brute Force
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public static int[] twoSumBruteForce(int[] nums, int target) {
        int[] solutionArray = {-1, -1};
        for(int i = 0; i < nums.length-1; i++) {
            for(int k = i+1; k < nums.length; k++) {
                if(nums[i] + nums[k] == target) {
                    solutionArray[0] = i;
                    solutionArray[1] = k;
                    break;
                }
            }
        }
        return solutionArray;
    }


    // Two Pass
    // Time Complexity: O(2n) => O(n)
    // Space Complexity: O(n)
    public static int[] twoSumTwoPass(int[] nums, int target) {
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            valueToIndex.put(nums[i], i);
        }
            
        for(int i = 0; i < nums.length; i++) {            
            int complement = target - nums[i];
            if(valueToIndex.containsKey(complement) && i != valueToIndex.get(complement)) {
                return new int[] {valueToIndex.get(complement), i};
            }
        }
        return null;
    }


    // One Pass with HashMap
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int[] twoSumOnePass(int[] nums, int target) {
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {            
            int complement = target - nums[i];
            if(valueToIndex.containsKey(complement)) {
                return new int[] {valueToIndex.get(complement), i};
            }
            
            valueToIndex.put(nums[i], i);
        }
        return null;
    }
}