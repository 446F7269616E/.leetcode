/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int MaxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            //分别判断奇数和偶数的情况
            int len1 = expand(s,i,i+1);
            int len2 = expand(s,i,i);

            int len = Math.max(len1, len2);
            if(len > MaxLen){
                MaxLen = len;
                start = i-(len-1)/2;
            }
        }
        return s.substring(start,start+MaxLen);
}
    private int expand(String s,int left,int right){
        while (left>=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            //从中间扩展至两边判断是否回文
            left--;
            right++;
        }
        return right - left - 1;
    }
}
// @lc code=end

