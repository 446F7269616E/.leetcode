/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int before = 0;
        int after = 0;
        while (after < nums.length) {
            if(nums[after] != val){
                nums[before] = nums[after];
                before++;
            }
            after++;
        }
        return before;
    }
}
// @lc code=end

