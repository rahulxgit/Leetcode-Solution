/*
 * Problem #3980: Minimum Operations to Transform Binary String
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: python3
 * Date: 04/07/2026, 21:01:44
 * Link: https://leetcode.com/problems/minimum-operations-to-transform-binary-string/
 */

class Solution:
    def minOperations(self, s1: str, s2: str) -> int:
        n = len(s1)
        o1 = s1.count('1')
        o2 = s2.count('1')

        covered = [False] * n
        k = 0

        for i in range(n):
            if s1[i] == '1' and s2[i] == '0' and not covered[i]:
                if i + 1 < n:
                    covered[i] = True
                    covered[i+ 1] = True
                    k += 1
                elif i -1 >= 0:
                    covered[i] = True
                    k += 1
                else:
                    return -1

        return 3 * k - o1 + o2
        
