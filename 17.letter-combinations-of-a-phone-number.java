/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */
import java.util.*;
// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        String[] letters = {
            "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };

        StringBuilder path = new StringBuilder();

        backtrack(digits, 0, letters, path, result);

        return result;
    }

    private void backtrack(String digits, int index,
                           String[] letters, StringBuilder path,
                           List<String> result) {

        // 当前组合长度等于输入数字长度，说明组合完成
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }

        // 获取当前数字对应的字母
        String current = letters[digits.charAt(index) - '2'];

        for (int i = 0; i < current.length(); i++) {
            // 选择一个字母
            path.append(current.charAt(i));

            // 递归处理下一个数字
            backtrack(digits, index + 1, letters, path, result);

            // 撤销刚才的选择
            path.deleteCharAt(path.length() - 1);
        }
    }
}
// @lc code=end

