/*
 * Problem #2095: Delete the Middle Node of a Linked List
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 15/06/2026, 17:51:59
 * Link: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
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
    public ListNode deleteMiddle(ListNode head) {
        // edge case
        if(head == null || head.next == null){
            return null;
        }
        // slow fast even odd
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        

        // slow = slow.next;
        // fast = fast.next.next;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
        
        return head;
    }
}
