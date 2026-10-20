/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            switch(x){
            case '(' -> stack.push(')');
            case '{' -> stack.push('}');
            case '[' -> stack.push(']');
            default -> {if(stack.isEmpty() || stack.pop() != x){
                return false;
            }}
        }
        }
        return stack.isEmpty();


    }
}
// @lc code=end

