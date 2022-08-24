/**
 * LENGTH OF LONGEST SUBSTRING WITHOUT REPEAT
 * 
 * Level: Medium
 * 
 * Given a string s, find the length of the longest substring without repeating characters.
 */
package java.medium.strings;
import java.util.*;

public class LongestSubWORepeat {
    // Brute Force
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public int bruteForceLengthOfLongestSubstring(String s) { 
        if(s.length() == 0)
            return 0;
        int maxLength = 1;
        Set<Character> substring = new HashSet<>();
        
        for(int i = 0; i < s.length()-1; i++) {
            substring.clear();
            substring.add(s.charAt(i));
            int substringLength = 1;
                        
            for(int j = i+1; j < s.length(); j++) {
                if(substring.contains(s.charAt(j))) 
                    break;
                substring.add(s.charAt(j));
                substringLength++;
            }
            
            if(substringLength > maxLength)
                maxLength = substringLength;
        } 
        return maxLength;
    }

    // String Substitution For Sliding Window
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int stringSubLengthOfLongestSubstring(String s) { 
        if(s.length() == 0)
            return 0;
        int maxLength = 1;
        String sub = "";
        
        for(char c : s.toCharArray()) {
            String current = String.valueOf(c);
            
            if(sub.contains(current)) 
                sub = sub.substring(sub.indexOf(current) + 1);
            
            sub = sub + String.valueOf(c);
            
            if(sub.length() > maxLength)
                maxLength = sub.length();
        } 
        return maxLength;
    }
}
