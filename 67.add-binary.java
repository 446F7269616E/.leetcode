/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start

class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        //进位

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            //某位求和的总和
            if(i >= 0){
                //防止某个字符先走到开头
                sum += a.charAt(i) - '0';
                //将字符转为整数
            }
            if(j >= 0){
                sum += b.charAt(j) - '0';
            }
            result.append(sum % 2);
            //可以使该位数保持在0和1之间
            carry = sum / 2;
            i--;
            j--;
        }

        return result.reverse().toString();
    }
}
// @lc code=end

