/*
 * Problem #912: Sort an Array
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 23/04/2026, 18:17:11
 * Link: https://leetcode.com/problems/sort-an-array/
 */

class Solution {

    public void merge(int nums[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = nums[l + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = nums[mid + j + 1];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }

        while (i < n1) nums[k++] = left[i++];
        while (j < n2) nums[k++] = right[j++];
    }

    // helper function
    public void mergeSort(int nums[], int l, int r) {
        if (l >= r) return;

        int mid = l + (r - l) / 2;

        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);

        merge(nums, l, mid, r);
    }

    // main function (LeetCode entry)
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}
