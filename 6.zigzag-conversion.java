/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */

// @lc code=start

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            // 当前处理第 i 行
            int gap1 = 2 * (numRows - 1 - i);
            int gap2 = 2 * i;
            int index = i;

            for (int j = 0; index < s.length(); j++) {
                result.append(s.charAt(index));

                if (gap1 == 0) {
                    index += gap2;
                } else if (gap2 == 0) {
                    index += gap1;
                } else if (j % 2 == 0) {
                    index += gap1;
                } else {
                    index += gap2;
                }
            }
        }

        return result.toString();
    }
}

// @lc code=end

