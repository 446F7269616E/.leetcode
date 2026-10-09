/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */
import java.util.Arrays;
// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        char[] y = String.valueOf(x).toCharArray();
        char[] z = new char[y.length];
        //注意创建等长数组
        for (int i = 0; i < z.length; i++) {
            z[i] = y[y.length-1-i];
            //倒序对应位置始终为length-1-i
        }
        if(Arrays.equals(y,z)){
            //不能直接用==
            return true;}
        return false;
    
    }
}
        // for (int i = y.length - 1; i > 0; i--) {
        //     注意数组不要越界
        //     for (int j = 0; i<y.length; j++){
        //         z[i] = y[j];
        //     }
            
        // }
// @lc code=end

