/**
 * BINARY SEARCH
 * Level: Easy
 * 
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 */
package java.easy.searching;

public class BinarySearch {
    // Iterative Approach
    // Time Complexity: O(logn)
    // Space Complexity: O(1)
    public int iterativeSearch(int[] nums, int target) {
        if(nums.length == 0 || nums == null)
            return -1;
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right) {
            int mid = left + (right - left) / 2;
            
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

}
