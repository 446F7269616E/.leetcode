/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        int before = 0;
        int after = 0;
        String result = "";

        while (before < s.length()) {
            after = before;

            while (after < s.length()) {
                if (s.charAt(before) == s.charAt(after)) {
                    int index1 = before;
                    int index2 = after;
                    boolean flag = true;

                    while (index1 < index2) {
                        if (s.charAt(index1) != s.charAt(index2)) {
                            flag = false;
                            break;
                        }
                        index1++;
                        index2--;
                    }

                    if (flag && after - before + 1 > result.length()) {
                        result = s.substring(before, after + 1);
                    }
                }

                after++;
            }

            before++;
        }

        return result;
    }
}
// @lc code=end

