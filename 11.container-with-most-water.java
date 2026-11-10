/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        double maxarea = 0;
        int maxdis = 0;
        for (int i = 0; i < height.length; i++) {
            if(height[i] > height[max]){
                max = i;
            }
        }
        //找最长边

        for (int i = 0; i < height.length; i++) {
            if((Math.abs(max - i) >= maxdis)){
                //x轴距离最大时更新
                if(height[max] >= height[i]){
                    maxarea = Math.pow(Math.min(height[max], height[i]),2);
                }
                else maxarea = height[max] * height[i];
                maxdis = Math.abs(max - i);
            }
        }

        return (int)maxarea;
    }
}
// @lc code=end

