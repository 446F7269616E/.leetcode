/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(target <= nums[i]){
                return i;
            }
            //不用考虑大于的情况
        }
        return nums.length;
    }
}
// @lc code=end

