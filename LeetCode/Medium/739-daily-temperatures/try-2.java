/*
 * Problem #739: Daily Temperatures
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 07/06/2026, 13:16:31
 * Link: https://leetcode.com/problems/daily-temperatures/
 */

class Solution {
    // make a pair class to store pair in stack
    class pair {
        int temperatures;
        int days;

        pair(int temperatures, int days) {
            this.temperatures = temperatures;
            this.days = days;
        }
    }

    Stack<pair> st = new Stack<>();

    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int ans[] = new int[n];
        // brute force 
        // for(int i = 0; i < n; i++){
        //     int days = 0;
        //     for(int j = i+ 1; j < n; j++){
        //         days++;
        //         if(temperatures[j] > temperatures[i]){
        //             ans[i] = days;
        //             break;
                    
        //         }
        //     }

        // }
        // using stack
        for (int i = n - 1; i >= 0; i--) {


            while (!st.isEmpty() && st.peek().temperatures <= temperatures[i]) {

                st.pop();
            }

            if(!st.isEmpty()){
                ans[i] = st.peek().days - i;
            }
            st.push(new pair(temperatures[i], i));

        }
        return ans;
    }
}
