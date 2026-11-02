/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
 */

// @lc code=start

import java.util.*;

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
        List<String> result1 = new ArrayList<>();
        List<String> result2 = new ArrayList<>();

        traverse(p, result1);
        traverse(q, result2);

        return result1.equals(result2);
    }

    private void traverse(TreeNode node, List<String> result) {
        if (node == null) {
            result.add("#");
            //记录空节点防止结构被破坏
            return;
        }

        result.add(String.valueOf(node.val));
        traverse(node.left, result);
        traverse(node.right, result);
        //前序遍历
    }
}
// @lc code=end

