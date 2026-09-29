/*
 * Problem #176: Second Highest Salary
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: mysql
 * Date: 09/09/2026, 20:36:52
 * Link: https://leetcode.com/problems/second-highest-salary/
 */

# Write your MySQL query statement below
SELECT MAX(salary) AS SecondHighestSalary
FROM  Employee
WHERE salary < (
    SELECT MAX(salary) 
    FROM Employee
);


