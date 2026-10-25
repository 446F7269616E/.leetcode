/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int result = 0;
        boolean flag = false;
        for (int i = s.length()-1; i >= 0; i--) {
            char x = s.charAt(i);
            if(x != ' '){
                flag = true;
            }
            if (x == ' ' && flag) {
                return result;
            }
            if(x != ' ' && flag){
                result++;
            }
        }
        return result;
    }
}
// @lc code=end

