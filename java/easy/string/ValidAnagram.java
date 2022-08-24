/**
 * VALID ANAGRAM  
 * Level: Easy
 * 
 * Given two strings s and t, return true if t is an anagram of s, and
 * false otherwise.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters
 * exactly once.
 */
package java.easy.string;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        HashMap<Character, Integer> letterToOcc = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if(letterToOcc.get(currChar) == null)
                letterToOcc.put(currChar, 1);
            else
                letterToOcc.put(currChar, letterToOcc.get(currChar) + 1);
        }
        
        for(int i = 0; i < t.length(); i++) {
            char currChar = t.charAt(i);
            if(letterToOcc.get(currChar) == null)
                return false;
            else
                letterToOcc.put(currChar, letterToOcc.get(currChar) - 1 );
        }
        
        for(int i : letterToOcc.values()) {
            if(i != 0)
                return false;
        }
        
        return true;
    }
}
