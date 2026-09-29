/*
 * Problem #204: Count Primes
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 02/06/2026, 16:05:40
 * Link: https://leetcode.com/problems/count-primes/
 */

class Solution {
    public boolean isPrime(int num){
        if(num == 0 || num == 1){
            return false;
        }
        for(int i = 2; i * i <= num; i++){
            if((num % i) == 0){
                return false;
            }
        }
        return true;
    }
    public int countPrimes(int n) {
        // bit manipulation or brute force
        //brute force prime number count

        // int count = 0;
        // for (int i = 2; i < n; i++) {
        //     int num = i;
        //     boolean prime = true;

        //     // check factor which must only equal to 2
        //     for (int j = 2; j * j <= num; j++) {     // only check till prefect square of num
        //         if (num % j == 0) {
        //             prime = false;
        //             break;
        //         }
        //     }
        //     if (prime)
        //         count++;
        // }
        // return count;  // tc = O(n*root(n))

        if(n <= 2){
            return 0;
        }

        boolean seive[] = new boolean[n];
        seive[0] = false;
        seive[1] = false;
        for(int i = 2; i < seive.length; i++){
            seive[i] = true;
        }

        for(int i = 2; i * i <= n; i++){  // all check prime or not
            if(seive[i]){
                for(int j = i * 2; j < n; j += i){
                    seive[j] = false;
                }
            }
        }
        // iterate seive to check how many are true i.e prime
        int count = 0;
        for(int i = 0; i < n; i++){
            if(seive[i] == true){
                count++;
            }
        }
        return count;
    }
}
