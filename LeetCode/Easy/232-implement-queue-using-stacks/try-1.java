/*
 * Problem #232: Implement Queue using Stacks
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 05/06/2026, 22:36:33
 * Link: https://leetcode.com/problems/implement-queue-using-stacks/
 */

import java.util.*;
class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {

        // s1 --> s2
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

          s1.push(x);
        //swap
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    
    public int pop() {
        if(s1.isEmpty()){
            return -1;
        }
        int res = s1.peek();
        s1.pop();
        return res;
    }
    
    public int peek() {
        if(s1.isEmpty()){
            return -1;
        }
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
