/**
 * CONTAINS DUPLICATE
 * Level: Easy
 * 
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */
package java.easy.hashing;

public class ContainsDup {
    // Hashing
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        for(int i: nums) {
            if(!numsSet.add(i))
                return true;
        }
        
        return false;
    }
}
