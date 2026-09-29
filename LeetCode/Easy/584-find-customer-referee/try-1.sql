/*
 * Problem #584: Find Customer Referee
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: mysql
 * Date: 08/04/2026, 16:26:56
 * Link: https://leetcode.com/problems/find-customer-referee/
 */

# Write your MySQL query statement below
SELECT name FROM Customer WHERE (referee_id != 2) OR (referee_id is null);
