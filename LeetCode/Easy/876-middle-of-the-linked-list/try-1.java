/*
 * Problem #876: Middle of the Linked List
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/04/2026, 13:28:59
 * Link: https://leetcode.com/problems/middle-of-the-linked-list/
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
    public ListNode middleNode(ListNode head) {

        // find middle Node
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        // int middleidx = (count + 1) / 2;
        int middleidx = count / 2;
        ListNode temp1 = head;
        for(int i = 0; i < middleidx; i++){
            temp1 = temp1.next;
        }
        return temp1;
    }
}
