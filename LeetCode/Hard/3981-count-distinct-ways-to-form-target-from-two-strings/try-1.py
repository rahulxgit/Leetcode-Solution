/*
 * Problem #3981: Count Distinct Ways to Form Target from Two Strings
 * Difficulty: Hard
 * Submission: Try 1
 * status: Accepted
 * Language: python3
 * Date: 04/07/2026, 20:24:45
 * Link: https://leetcode.com/problems/count-distinct-ways-to-form-target-from-two-strings/
 */

class Solution:
    def interleaveCharacters(self, word1: str, word2: str, target: str) -> int:
        MOD = 10 ** 9 + 7

        from functools import lru_cache

        n1 = len(word1)
        n2 = len(word2)
        m = len(target)

        @lru_cache(None)
        def dfs(pos, i1, i2, mask):
            if pos == m:
                return 1 if mask == 3 else 0

            ans = 0
            ch = target[pos]

            for i in range(i1, n1):
                if word1[i] == ch:
                    ans = (ans + dfs(pos + 1, i + 1, i2, mask | 1)) % MOD

            for j in range(i2, n2):
                if word2[j] == ch:
                    ans = (ans + dfs(pos + 1, i1, j+ 1, mask | 2)) % MOD

            return ans

        return dfs(0,0,0,0)
        
