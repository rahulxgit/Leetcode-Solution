/*
 * Problem #2643: Row With Maximum Ones
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 01/04/2026, 14:45:59
 * Link: https://leetcode.com/problems/row-with-maximum-ones/
 */

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        // for in each row like 1 ,2 ,3
        int m = mat.length;
        int n = mat[0].length;

        int arr[] = new int[2];

        int count_of_one = 0;
         int index = 0;
        

        for(int i = 0; i < m; i++){
            // iterate in each coloumn
            int curr_count = 0;
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 1){
                    curr_count++;
                    
                }
            }
            if(curr_count > count_of_one){
                count_of_one = curr_count;
                index = i;
            }

        }
        arr[0] = index;
        arr[1] =  count_of_one;
        return arr;
    }
}
