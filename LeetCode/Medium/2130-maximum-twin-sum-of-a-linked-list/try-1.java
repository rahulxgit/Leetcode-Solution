/*
 * Problem #2130: Maximum Twin Sum of a Linked List
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 14/06/2026, 06:01:32
 * Link: https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
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
    public int pairSum(ListNode head) {
        // Linkedin reverse
        // ListNode prev = null;
        // ListNode curr = head;

        // while(curr != null){
        //     ListNode next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }

        // // new LL = prev -> reverse of head
        // ListNode temp1 = head;
        // ListNode temp2 = prev;

        // int sum = 0;
        // while(temp1 != null){
        //     int currSum = temp1.val + temp2.val;
        //     sum = Math.max(currSum, sum);
        //     temp1 = temp1.next;
        //     temp2 = temp2.next;
        // }
        // return sum;

        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse slow
        ListNode prev = null;
        ListNode curr = slow;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        int maxSum = 0;
        ListNode temp1 = head;
        ListNode temp2 = prev;

        while(temp2 != null){
            maxSum = Math.max(maxSum, (temp2.val + temp1.val));
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return maxSum;

    }
}
