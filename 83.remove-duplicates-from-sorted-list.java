/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */

// @lc code=start


  class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode current = head;

        while (current.next != null) {
            int before = current.val;
            int after = current.next.val;
            
            if (before == after) {
                current.next = current.next.next;
                //确切修改对应节点的值
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
// @lc code=end

