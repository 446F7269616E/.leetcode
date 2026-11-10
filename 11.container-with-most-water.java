/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        
        while (right >= left) {
            result = Math.max(Math.min(height[left],height[right]) * (right - left),result);
    
            if(height[left] > height[right]){
                right--;
            }
            else left++;
            
        }
        return result;
    }
}
// @lc code=end

