/*
 * Problem #181: Employees Earning More Than Their Managers
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: mysql
 * Date: 10/09/2026, 16:03:17
 * Link: https://leetcode.com/problems/employees-earning-more-than-their-managers/
 */

# Write your MySQL query statement below
select e.name as Employee
from Employee e
 JOIN Employee m
ON e.managerID = m.id
where e.salary > m.salary
