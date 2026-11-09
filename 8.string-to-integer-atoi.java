/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        long result = 0;
        //和上一题一样用*10累加来计算
        boolean flag = false;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && flag == false) {
                continue;
            }

            if (!flag && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                sign = s.charAt(i) == '-' ? -1 : 1;
                flag = true;
                continue;
            }

            if (Isint(s.charAt(i)) == -1) {
                break;
            }

            flag = true;
            int digit = s.charAt(i) - '0';

            result = result * 10 + digit;
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int)(result * sign);
    }

    private int Isint(char x) {
        if (x >= '0' && x <= '9') {
            return x;
        }
        return -1;
    }
}
// @lc code=end

