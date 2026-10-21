/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode();
        ListNode current = list3;

        while (list1 != null && list2 != null) {
            //判断当前是否为空而不是下一个是否为空
            if (list1.val >= list2.val) {
                current.next = list2;
                list2 = list2.next;
            } else {
                current.next = list1;
                list1 = list1.next;
            }
            //比较应该放哪个
            current = current.next;
            //移动指针
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        //循环结束时，如果有非空链表则把它接在后面
        return list3.next;
    }
}
// @lc code=end

