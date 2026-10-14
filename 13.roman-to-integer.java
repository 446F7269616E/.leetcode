/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
             int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int num = switch (s.charAt(i)) {
                //string.chaAt(i)用于获取第i个索引的值
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };

            if (num < prev) {
                result -= num;
            } else {
                result += num;
            }

            prev = num;
        }

        return result;
    }
}
// @lc code=end

