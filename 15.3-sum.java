/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */
import java.util.*;
// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // 固定元素去重
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum > 0) {
                    right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // 左指针去重
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // 右指针去重
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }
            }
        }

        return result;
    }
}
// @lc code=end

