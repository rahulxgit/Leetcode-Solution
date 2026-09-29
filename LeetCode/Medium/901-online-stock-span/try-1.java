/*
 * Problem #901: Online Stock Span
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 07/06/2026, 12:14:24
 * Link: https://leetcode.com/problems/online-stock-span/
 */

class StockSpanner {
    int arr[] = new int[2];
    Stack<int[]> st = new Stack<>();
    // Stack<pair> st = new Stack<>();

    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int span = 1;
        while(!st.isEmpty() && st.peek()[0] <= price){
            span += st.peek()[1];
            st.pop();
        }
        st.push(new int[]{price, span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
