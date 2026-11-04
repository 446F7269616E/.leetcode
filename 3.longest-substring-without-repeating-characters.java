/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int before = 0;
        int after = 0;
        int result = 0;
        HashSet<Character> set = new HashSet<>();
        //这里的set用于做一个当前最大的窗口承载，左端为before，右端为after

        while (after <= s.length() - 1) {
            while (set.contains(s.charAt(after))) {
                //这里必须使用while来保证before可以越过所有的重复位置
                set.remove(s.charAt(before));
                before++;
            }
            result = Math.max(after-before+1,result);
            //要比较当前长度和历史长度哪个大
            set.add(s.charAt(after));
            after++;

        }
        return result;
    }
}
// @lc code=end

