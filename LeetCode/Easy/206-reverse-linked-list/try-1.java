/*
 * Problem #206: Reverse Linked List
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 16/04/2026, 12:13:39
 * Link: https://leetcode.com/problems/reverse-linked-list/
 */

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
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        // ListNode back = curr.next;

        while(curr != null){
            ListNode next = curr.next;
             curr.next = prev;
             prev = curr;
             curr = next;
            // back.next = curr;
            // curr = curr.next;
        }
        // prev.next = curr;
        // curr.next = back;

        return prev;
    }
}
