/*
 * Problem #1239: Maximum Length of a Concatenated String with Unique Characters
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 18/05/2026, 17:10:42
 * Link: https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/
 */

class Solution {
    public int maxLength(List<String> arr) {
        List<Integer> uniqueCharStrings = new ArrayList<>();

        for (String s : arr) {
            Set<Character> set = new HashSet<>();
            
            for (char ch : s.toCharArray()) {
                set.add(ch);
            }

            if (set.size() != s.length()) { // means they have duplicates
                continue;
            }

            int val = 0; // Store the string in the form of a number (binary)
            for (char ch : s.toCharArray()) {
                val |= 1 << (ch - 'a');
            }

            uniqueCharStrings.add(val);
        }

        int[] result = { 0 }; // This will store the longest
        dfs(0, 0, result, uniqueCharStrings);
        return result[0];
    }

    private void dfs(int idx, int temp, int[] result, List<Integer> uniqueCharStrings) {
        result[0] = Math.max(result[0], Integer.bitCount(temp));

        for (int i = idx; i < uniqueCharStrings.size(); i++) {
            if ((temp & uniqueCharStrings.get(i)) == 0) {
                // means no unique characters in temp and uniqueCharStrings[i]
                // So concatenate them: temp | uniqueCharStrings[i]
                dfs(i + 1, temp | uniqueCharStrings.get(i), result, uniqueCharStrings);
            }
        }
    }
}
