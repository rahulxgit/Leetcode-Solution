/*
 * Problem #3984: Divisible Game
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 05/07/2026, 08:38:21
 * Link: https://leetcode.com/problems/divisible-game/
 */

class Solution {
    public int divisibleGame(int[] nums) {
        int M = 1000000007;
        HashSet<Integer> s = new HashSet<>();
        s.add(2);

        for(int x : nums){
            for(int d = 2; d * d <= x; d++){
                if(x % d == 0){
                    s.add(d);
                    s.add(x/d);
                }
            }
            if(x > 1) s.add(x);
        }

        ArrayList<Integer> kList = new ArrayList<>(s);
        Collections.sort(kList);

        long best = Long.MIN_VALUE;
        int kAns = 2;

        for(int k : kList){
            long cur = Long.MIN_VALUE, mx = Long.MIN_VALUE;
            for(int x : nums){
                long v = x % k == 0 ? x : -x;
                cur = cur == Long.MIN_VALUE ? v : Math.max(v, cur + v);
                mx = Math.max(mx, cur);
            }

            if(mx > best || (mx == best && k < kAns)){
                best = mx;
                kAns = k;
            }
        }

        return (int)(((best * kAns) % M + M) % M);
    }
}
