/*
 * Problem #225: Implement Stack using Queues
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 05/06/2026, 22:34:56
 * Link: https://leetcode.com/problems/implement-stack-using-queues/
 */

import java.util.*;

class MyStack {
    // take two queue
    Queue<Integer> q1 = new LinkedList<>(); // main operational
    Queue<Integer> q2 = new LinkedList<>(); // temp

    public MyStack() {

    }

    public void push(int x) {
        q2.offer(x); // first el push
        while (!q1.isEmpty()) { // move all the el form q1 to q2
            q2.offer(q1.poll());

        }
        Queue<Integer> temp = q1;  // full queue swap togther
        q1 = q2;
        q2 = temp;

    }

    public int pop() {
        if (q1.isEmpty()) {
            return -1;
        }
        int res = q1.peek();
        q1.poll();
        return res;
    }

    public int top() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
