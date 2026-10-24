/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(target > nums[mid]){
                left = mid+1;
            }
            else if(target < nums[mid]){
                right = mid-1;
            }
            //中间已经比较过了，所以左右要对应改变，不能直接照搬
            else{
                return mid;
            }
        }
        return left;
    }
}
// @lc code=end                

