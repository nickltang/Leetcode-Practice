/**
 * IS VALID PALINDROME
 * Level: Easy
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric
 * characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
package java.easy.string;

public class IsValidPalindrome {
    // Two Pointer Solution
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        String str = s.toLowerCase();
        
        while(i < j) {
            while(i < j && !Character.isLetterOrDigit(str.charAt(i))) 
                i++;
            
            while(i < j && !Character.isLetterOrDigit(str.charAt(j))) 
                j--;
            
            if(str.charAt(i) != str.charAt(j))
                return false;
            
            i++;
            j--;
        }
        
        return true;
    }
}
