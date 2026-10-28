/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int result = 0;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if((long)mid*mid <= x){
                //long强制类型转换防止int乘法溢出
                result = mid;
                //找到小于的x的平方根的最大整数
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }
        return result;
    }
}
// @lc code=end

