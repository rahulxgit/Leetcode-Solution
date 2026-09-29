/*
 * Problem #2095: Delete the Middle Node of a Linked List
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/04/2026, 17:00:42
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

        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int middleIndex = (count / 2);
        ListNode temp1 = head;
        for (int i = 1; i < middleIndex; i++) {
            temp1 = temp1.next;
        }
        if (temp1 != null && temp1.next != null) {
            temp1.next = temp1.next.next; // fix null pointer error
        }
        temp1 = head;
        return temp1;
    }
}
