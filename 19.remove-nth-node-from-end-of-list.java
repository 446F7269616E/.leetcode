/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode s = head;
        ListNode cal = head;
        int size = 0;
        while (s != null) {
            s = s.next;
            size++;
        }
        int target = size - n;
        if (target == 0) {
            head = head.next;
        }
        else{
            for (int i = 0; i < target - 1; i++) {
                cal = cal.next;
            }
            cal.next = cal.next.next;
            
        }
        return head;
        
    }
}
// @lc code=end

