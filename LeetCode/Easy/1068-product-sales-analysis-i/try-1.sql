/*
 * Problem #1068: Product Sales Analysis I
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: mysql
 * Date: 09/06/2026, 23:39:59
 * Link: https://leetcode.com/problems/product-sales-analysis-i/
 */

# Write your MySQL query statement below
SELECT
    p.product_name,
    s.year,
    s.price
FROM Sales s
JOIN Product p
ON s.product_id = p.product_id;
