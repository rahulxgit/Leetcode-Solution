/*
 * Problem #1683: Invalid Tweets
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: mysql
 * Date: 04/06/2026, 21:53:22
 * Link: https://leetcode.com/problems/invalid-tweets/
 */

# Write your MySQL query statement below
SELECT tweet_id FROM Tweets
WHERE (CHAR_LENGTH(content) > 15)
