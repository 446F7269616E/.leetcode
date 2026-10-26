/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start

import java.util.Arrays;
class Solution {
    public int[] plusOne(int[] digits) {
        int i = 0;
        if (digits.length == 0) {
            return new int[]{1};
        }
        //在都是9的时候添加一个1
        if(digits[digits.length - 1] != 9){
            digits[digits.length - 1]++;
        } 
        else{
            i++;
            int [] result = plusOne(Arrays.copyOf(digits, digits.length-i));
            return Arrays.copyOf(result, result.length + 1);
            // 把递归处理后的数组扩展一位，末位默认为0
        }
        return digits;
    }
}
// @lc code=end

