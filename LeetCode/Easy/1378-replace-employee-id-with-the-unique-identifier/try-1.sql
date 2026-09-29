/*
 * Problem #1378: Replace Employee ID With The Unique Identifier
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: mysql
 * Date: 08/06/2026, 18:25:54
 * Link: https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/
 */

# Write your MySQL query statement below
SELECT eu.unique_id, e.name
FROM Employees e
LEFT JOIN EmployeeUNI eu
ON e.id = eu.id;
