/*
 * Problem #328: Odd Even Linked List
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 13/04/2026, 17:51:42
 * Link: https://leetcode.com/problems/odd-even-linked-list/
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
    public ListNode oddEvenList(ListNode head) {
        // do this question in Single loop

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenStart = head.next;

        while (even != null && even.next != null) {
            odd.next = even.next;
            even.next = even.next.next;


            odd = odd.next;
            even = even.next;
        }

        // odd = head;
        odd.next = evenStart;
        // odd = head;
        return head;
    }
}
