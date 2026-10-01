/*
 * Problem #735: Asteroid Collision
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 15/06/2026, 17:24:04
 * Link: https://leetcode.com/problems/asteroid-collision/
 */

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] < 0) {
                // must collide with st.peek();
                while(!st.isEmpty() && st.peek() > 0 &&  st.peek() < Math.abs(asteroids[i])){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek() > Math.abs(asteroids[i])){
                    continue;
                }else if(!st.isEmpty() && st.peek() == Math.abs(asteroids[i])){
                    st.pop();
                    continue;
                }

                if (st.isEmpty() || st.peek() < 0) {
                    st.push(asteroids[i]);
                }
                
            } else {
                st.push(asteroids[i]);
            }
        }

        // stack -  int[]
        int arr[] = new int[st.size()];
        // ArrayList<Integer> arr = new ArrayList<>();  // retrun type mis match
        // while(!st.isEmpty()){
        //     arr.add(st.pop());
        // }

        for(int i = st.size() - 1; i >= 0; i--){
            arr[i] = st.pop();
        }
        return arr;
    }
}
