/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
                if (n <= 2) return n;

        int a = 1;
        int b = 2;

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            //b的下一个等于ab之和
            a = b;
            //a进位
            b = next;
            //b进位
        }

        return b;
    }
    }

// @lc code=end

