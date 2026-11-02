/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
 */

// @lc code=start


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        //空的时候分两种情况比较

        if(p.val != q.val){
            return false;
        }
        //比较当前节点相不相同

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        //比较左子树和右子树相不相同
}
}
// @lc code=end

