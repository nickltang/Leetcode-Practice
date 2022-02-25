import java.util.*;
/**
 * TWO SUM
 * Level: Medium
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


    public static void main(String[] args) {
        // Test Cases
        int[] test0 = {2,7,11,15};
        int target0 = 9;
        int[] solution0 = {0, 1};

        int[] test1 = {3,2,4};
        int target1 = 6;
        int[] solution1 = {1, 2};

        int[] test2 = {3,3};
        int target2 = 6;
        int[] solution2 = {0, 1};

        int[] test3 = {3, 2, 5, 6, 8};
        int target3 = 9;
        int[] solution3 = {0, 3};

        // Test Brute Force
        System.out.println("BRUTE FORCE\n-------------------------");
        System.out.println("Case 0: " + Arrays.toString(test0));
        System.out.println("\tTarget: " + target0);
        int[] answer0 = twoSumBruteForce(test0, target0);
        System.out.println("\tSolution: " + Arrays.toString(solution0) + "\n\tAnswer: " + Arrays.toString(answer0));
        
        System.out.println("\nCase 1: " + Arrays.toString(test1));
        System.out.println("\tTarget: " + target1);
        int[] answer1 = twoSumBruteForce(test1, target1);
        System.out.println("\tSolution: " + Arrays.toString(solution1) + "\n\tAnswer: " + Arrays.toString(answer1));   

        System.out.println("\nCase 2: " + Arrays.toString(test2));
        System.out.println("\tTarget: " + target2);
        int[] answer2 = twoSumBruteForce(test2, target2);
        System.out.println("\tSolution: " + Arrays.toString(solution2) + "\n\tAnswer: " + Arrays.toString(answer2));

        System.out.println("\nCase 3: " + Arrays.toString(test3));
        System.out.println("\tTarget: " + target3);
        int[] answer3 = twoSumBruteForce(test3, target3);
        System.out.println("\tSolution: " + Arrays.toString(solution3) + "\n\tAnswer: " + Arrays.toString(answer3));

        System.out.println("-------------------------\n\n");
        

        // Test Two Pass Hashmap
        System.out.println("TWO PASS HASHMAP\n-------------------------");
        System.out.println("Case 0: " + Arrays.toString(test0));
        System.out.println("\tTarget: " + target0);
        answer0 = twoSumTwoPass(test0, target0);
        System.out.println("\tSolution: " + Arrays.toString(solution0) + "\n\tAnswer: " + Arrays.toString(answer0));
        
        System.out.println("\nCase 1: " + Arrays.toString(test1));
        System.out.println("\tTarget: " + target1);
        answer1 = twoSumTwoPass(test1, target1);
        System.out.println("\tSolution: " + Arrays.toString(solution1) + "\n\tAnswer: " + Arrays.toString(answer1));   
        
        System.out.println("\nCase 2: " + Arrays.toString(test2));
        System.out.println("\tTarget: " + target2);
        answer2 = twoSumTwoPass(test2, target2);
        System.out.println("\tSolution: " + Arrays.toString(solution2) + "\n\tAnswer: " + Arrays.toString(answer2));

        System.out.println("\nCase 3: " + Arrays.toString(test3));
        System.out.println("\tTarget: " + target3);
        answer3 = twoSumTwoPass(test3, target3);
        System.out.println("\tSolution: " + Arrays.toString(solution3) + "\n\tAnswer: " + Arrays.toString(answer3));
        
        System.out.println("-------------------------\n\n");


        // Test One Pass Hashmap
        System.out.println("ONE PASS HASHMAP\n-------------------------");
        System.out.println("Case 0: " + Arrays.toString(test0));
        System.out.println("\tTarget: " + target0);
        answer0 = twoSumOnePass(test0, target0);
        System.out.println("\tSolution: " + Arrays.toString(solution0) + "\n\tAnswer: " + Arrays.toString(answer0));
        
        System.out.println("\nCase 1: " + Arrays.toString(test1));
        System.out.println("\tTarget: " + target1);
        answer1 = twoSumOnePass(test1, target1);
        System.out.println("\tSolution: " + Arrays.toString(solution1) + "\n\tAnswer: " + Arrays.toString(answer1));

        System.out.println("\nCase 2: " + Arrays.toString(test2));
        System.out.println("\tTarget: " + target2);
        answer2 = twoSumOnePass(test2, target2);
        System.out.println("\tSolution: " + Arrays.toString(solution2) + "\n\tAnswer: " + Arrays.toString(answer2));

        System.out.println("\nCase 3: " + Arrays.toString(test3));
        System.out.println("\tTarget: " + target3);
        answer3 = twoSumOnePass(test3, target3);
        System.out.println("\tSolution: " + Arrays.toString(solution3) + "\n\tAnswer: " + Arrays.toString(answer3));
    
        System.out.println("-------------------------\n\n");
    }
}