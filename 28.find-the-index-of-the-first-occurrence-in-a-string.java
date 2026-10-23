/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
// class Solution {
//     public int strStr(String haystack, String needle) {
//         int a = 0;
//         int b = 0;
//         while (a < haystack.length()) {
//             if(haystack.charAt(a) == needle.charAt(b)){
//                 b++;
//             }
//             if(b == needle.length()){
//                 return b - needle.length();
//             }
//             a++;
//         }
//         return -1;
//     }
// }
class Solution {
    public int strStr(String haystack, String needle) {
        for (int a = 0; a <= haystack.length() - needle.length(); a++) {
            // a只用在长度还能匹配的时候匹配，不用遍历后面的
            int b = 0;

            while (b < needle.length() &&
                   haystack.charAt(a + b) == needle.charAt(b)) {
                    //a为开始匹配的起始点，b为已经匹配的个数
                    //a+b在haystack里是已经匹配正确的位置
                b++;
            }

            if (b == needle.length()) {
                return a;
            }
        }
        return -1;
    }
}
// @lc code=end

