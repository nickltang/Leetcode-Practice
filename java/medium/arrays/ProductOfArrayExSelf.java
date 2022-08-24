/**
 * PRODUCT OF ARRAY EXCEPT SELF
 * Level: MEDIUM
 * 
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * 
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * 
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * 
 * The output array does not count as extra space for space complexity analysis.
 */
package java.medium.arrays;

public class ProductOfArrayExSelf {
    // In-place prefix/postfix array
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
            
        for(int i = 0; i < nums.length; i++) {
            res[i] = 1;
        }
        
        int prefix = 1;
        for(int i = 0; i < nums.length; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }
        
        int postfix = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            res[i] = res[i] * postfix;
            postfix *= nums[i];
        }
        
        
        
        return res;
    }
}
