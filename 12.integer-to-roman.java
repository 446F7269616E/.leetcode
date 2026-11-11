/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */

// @lc code=start
class Solution {
    public String intToRoman(int num) {
        int[] values = {
            1000, 900, 500, 400, 100, 90, 50,
            40, 10, 9, 5, 4, 1
        };

        String[] symbols = {
            "M", "CM", "D", "CD", "C", "XC", "L",
            "XL", "X", "IX", "V", "IV", "I"
        };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            //遍历所有值（值从大到小排列）
            while (num >= values[i]) {
                result.append(symbols[i]);
                //建立对应索引来增加字符串
                num -= values[i];
                //不断让结果减去能减去的最大值
                //贪心法
            }
        }

        return result.toString();
    }
}
// @lc code=end

