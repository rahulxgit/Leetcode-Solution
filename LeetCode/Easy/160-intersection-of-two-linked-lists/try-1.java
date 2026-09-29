/*
 * Problem #160: Intersection of Two Linked Lists
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 14/04/2026, 13:08:08
 * Link: https://leetcode.com/problems/intersection-of-two-linked-lists/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        ListNode tempA = headA;
        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }
        tempA = headA;

        // length of headB
        int lenB = 0;
        ListNode tempB = headB;
        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }
        tempB = headB;

        if (lenA > lenB) {
            for (int i = 0; i < Math.abs(lenA - lenB); i++) {
                tempA = tempA.next;
            }
            while (tempB != null) {
                if (tempA == tempB) {
                    return tempB;
                }
                tempB = tempB.next;
                tempA = tempA.next;
            }
        } else {
            for (int i = 0; i < Math.abs(lenA - lenB); i++) {
                tempB = tempB.next;
            }
            while (tempA != null) {
                if (tempA == tempB) {
                    return tempA;
                }
                tempA = tempA.next;
                tempB = tempB.next;
            }
        }

        // while()
        return null;
    }
}
