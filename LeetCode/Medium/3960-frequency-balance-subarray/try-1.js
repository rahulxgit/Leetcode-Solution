/*
 * Problem #3960: Frequency Balance Subarray
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: javascript
 * Date: 14/06/2026, 08:35:00
 * Link: https://leetcode.com/problems/frequency-balance-subarray/
 */

/**
 * @param {number[]} nums
 * @return {number}
 */
var getLength = function(nums) {
    const n = nums.length;
    let ans = 1;

    for(let i = 0; i < n; i++){
        const freq = new Map();
        const freqC = new Map();
        // let minF = Infinity, maxF = 0;

        for(let j = i; j < n; j++){
            const x = nums[j];
            const oF = freq.get(x) || 0;
            const nF = oF + 1;

            if(oF > 0){
                freqC.set(oF, freqC.get(oF) - 1);
                if(freqC.get(oF) == 0) freqC.delete(oF);
            }
            freqC.set(nF, (freqC.get(nF) || 0) + 1);
            freq.set(x, nF);

            
            const minF = Math.min(...freqC.keys());
            const maxF = Math.max(...freqC.keys());

            if(freq.size === 1){
                ans = Math.max(ans, j - i + 1);
            }else if (maxF === 2 * minF && freqC.size == 2){
                ans = Math.max(ans, j - i + 1);
            }
        }
    }
    return ans;
};
