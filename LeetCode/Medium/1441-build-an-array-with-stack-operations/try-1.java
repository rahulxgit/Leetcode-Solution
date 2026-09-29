/*
 * Problem #1441: Build an Array With Stack Operations
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 15/06/2026, 19:07:26
 * Link: https://leetcode.com/problems/build-an-array-with-stack-operations/
 */

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> s = new LinkedList<>();
        // Stack<Integer> st = new Stack<>();

        int j = 0;
        for(int i = 1; i <= n && j < target.length; i++){
            s.add("Push");
            
            
            if(i == target[j]){
                // st.push(i);
                j++;
                
            }else{
                // st.pop();
                s.add("Pop");
            }
            
            
        }
        return s;
    }
}
