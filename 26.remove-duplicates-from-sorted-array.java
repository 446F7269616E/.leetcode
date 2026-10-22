/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int before = 0;
        int after = 1;
        if (nums.length == 0) return 0;
        //记得判断数组是不是空的
        while (after < nums.length) {
            //数组长度-1是最后的序号，如果小于它最后一个没法遍历
            if(nums[before] == nums[after]){
                nums[after] = -1;
            }
            //这里没必要让after的位置变成-1，可以把条件判别直接改为不等，不加else
            else{
                before++;
                nums[before] = nums[after];
            }
            after++;
        }
        return before + 1;
    }
}
// @lc code=end

