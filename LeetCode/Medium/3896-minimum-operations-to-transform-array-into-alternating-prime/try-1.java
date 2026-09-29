/*
 * Problem #3896: Minimum Operations to Transform Array into Alternating Prime
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/04/2026, 21:21:26
 * Link: https://leetcode.com/problems/minimum-operations-to-transform-array-into-alternating-prime/
 */

class Solution {
    public boolean prime(int n){
        if(n <= 1) return false;
    

    for(int i = 2;i*i<=n;i++){
        if (n % i == 0) {
            return false;
        }
    }
        return true;

    }

    public int makePrime(int num){
        int count = 0;

        while(!prime(num)){
            num++;
            count++;
        }
        return count;
    }
    public int makeNonPrime(int num){
        int count = 0;

        while(prime(num)){
            num++;
            count++;
        }
        return count;
    }

    public int minOperations(int[] nums) {

        int n = nums.length;

        int total = 0;

        for(int i =0;i<n;i++){

            if(i % 2 ==0){
                if(!prime(nums[i])){
                    total += makePrime(nums[i]);
                }
            }else{
                if(prime(nums[i])){
                    total += makeNonPrime(nums[i]);
                }
            }
        }
        return total;
    }
}
