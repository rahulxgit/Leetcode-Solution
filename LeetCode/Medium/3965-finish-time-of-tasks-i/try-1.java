/*
 * Problem #3965: Finish Time of Tasks I
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 20/06/2026, 20:46:46
 * Link: https://leetcode.com/problems/finish-time-of-tasks-i/
 */

import java.util.*;
class Solution {
    List<Integer>[] g;
    int[] b;

    public long finishTime(int n, int[][] edges, int[] baseTime) {
        g = new ArrayList[n];
        Arrays.setAll(g, i -> new ArrayList<>());

        for(int[] x : edges) g[x[0]].add(x[1]);
        b = baseTime;
        return f(0);
    }

    long f(int u){
        if(g[u].size() == 0) return b[u];
        long mn = Long.MAX_VALUE, mx = 0;

        for(int v : g[u]){
            long t = f(v);
            mn = Math.min(mn, t);
            mx = Math.max(mx, t);
        }

        return mx * 2 - mn + b[u];
    }
}
