/*
 * Problem #1757: Recyclable and Low Fat Products
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: mysql
 * Date: 31/05/2026, 21:07:12
 * Link: https://leetcode.com/problems/recyclable-and-low-fat-products/
 */

# Write your MySQL query statement below
SELECT product_id FROM Products 
WHERE (low_fats = 'Y') 
& (recyclable = 'Y');

