/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        StringBuilder result = new StringBuilder();
        if (x == 0) {
            return 0;
        }
        if(x < 0){
            result.append("-");
        }
        while (x != 0) {
            int cal  = Math.abs(x % 10);
            //强制cal为正数
            result.append(cal);
            x = x / 10;
            //一个接一个地消掉x的位数
        }
        if (Long.parseLong(result.toString()) > Integer.MAX_VALUE || Long.parseLong(result.toString()) < Integer.MIN_VALUE) {
            return 0;
        }
        return Integer.valueOf(result.toString());
    }   
}
// @lc code=end

