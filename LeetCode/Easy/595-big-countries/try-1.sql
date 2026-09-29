/*
 * Problem #595: Big Countries
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: mysql
 * Date: 31/05/2026, 21:11:09
 * Link: https://leetcode.com/problems/big-countries/
 */

# Write your MySQL query statement below
SELECT name,  population, area FROM World
WHERE 
population >= 25000000 OR
area >= 3000000;
