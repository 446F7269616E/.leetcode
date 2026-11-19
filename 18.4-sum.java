/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */
import java.util.*;
// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            // 第一个固定元素去重
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {
                // 第二个固定元素去重
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int l = j + 1;
                int r = nums.length - 1;

                while (l < r) {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];

                    if (sum > target) {
                        r--;
                    }
                    else if (sum < target) {
                        l++;
                    }
                    else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));

                        // 左指针去重
                        while (l < r && nums[l + 1] == nums[l]) {
                            l++;
                        }

                        // 右指针去重
                        while (l < r && nums[r - 1] == nums[r]) {
                            r--;
                        }

                        l++;
                        r--;
                    }
                }
            }
        }

        return result;
    }
}

//ksum的通用解法：排序 + 固定 k−2 个元素 + 双指针 + 分层去重
// @lc code=end

