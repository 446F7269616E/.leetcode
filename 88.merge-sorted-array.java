/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1;
        int b = n - 1;
        int c = m + n - 1;
    //采用三指针，分别指向1的有效末尾，2的有效末尾，1的长度末尾
        while (b >= 0) {
            if (a < 0 || nums1[a] <= nums2[b]) {
                //需要判别a是否越界
                nums1[c] = nums2[b];
                b--;
            } else {
                nums1[c] = nums1[a];
                a--;
                //两个指针分开递减
            }
            c--;
        }
    }
}
// @lc code=end

