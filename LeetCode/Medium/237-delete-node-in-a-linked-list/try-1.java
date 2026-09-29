/*
 * Problem #237: Delete Node in a Linked List
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 08/04/2026, 15:31:08
 * Link: https://leetcode.com/problems/delete-node-in-a-linked-list/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;  // 4 1 1 9
        node.next = node.next.next; // only change in ref pointer or next(index) not in value
        // node.next(index of 2)  <-- node.next(index of 2).next(index of 3)
                                //   <-- ondex ot 3

        //  final indexing of LL -> 0 1 3 corrospind valus                            -> 4 1 9                       
    }
}
