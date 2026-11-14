/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int result = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // 更新最接近 target 的结果
                if (Math.abs((long) sum - target) < Math.abs((long) result - target)) {
                    result = sum;
                }

                // 根据当前和调整双指针
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    // 完全相等，不可能有更优解
                    return target;
                }
            }
        }

        return result;
    }
}
// @lc code=end

