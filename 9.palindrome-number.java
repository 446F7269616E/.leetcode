/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        char[] y = String.valueOf(x).toCharArray();
        int before = 0;
        int after = y.length-1;
        while(before < after) {
            //不用for遍历整个数组
            if(y[before] != y[after]){
                return false;
            }
            before++;
            after--;
        }
        return true;
    
    }}
            //这个写法容易在两个数不相等的时候无限循环，单个数无法判断
            // if(y[before] == y[after]){
            //     before++;
            //     after--;
            //     if(before >= after){
            //         使用>=来防止交错产生的问题
            //         return true;
            //     }
            // }
// @lc code=end

