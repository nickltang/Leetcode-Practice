/*
 * VALID PARENTHESES
 * Level: Easy
 * 
 * Given a string s containing just the characters '(', ')', '{', '}', '['
 * and ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 *      Open brackets must be closed by the same type of brackets.
 *      Open brackets must be closed in the correct order.
 */
package java.easy.stack.queue;

public class ValidParentheses {
    // Stack Implementation
    // Time Complexity: O(n)
    // Space Complexity: O(n) for stack size
    public boolean isValid(String s) {
        ArrayDeque<Character> paren = new ArrayDeque<>();
        
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            if(current == '(' || current == '{' || current == '[') {
                paren.push(current);
                continue;                
            }
            
            if(paren.size() == 0)
                return false;
            
            switch(current) {
                case ')':
                    if(paren.pop() != '(')
                        return false;
                    break;
                case '}':
                    if(paren.pop() != '{')
                        return false;
                    break;
                case ']':
                    if(paren.pop() != '[')
                        return false;
                    break;
            }
        }       
        
        if(paren.size() > 0)
            return false;
        return true;
    }
}
