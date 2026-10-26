/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1 ; i >= 0; i--) {
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        //进位不用单独写出来
        int[] result = new int[digits.length+1];
        result[0] = 1;
        //全是9的情况
        return result;
}
}
// @lc code=end

