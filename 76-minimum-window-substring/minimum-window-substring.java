class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!hm.containsKey(ch)) {
                hm.put(ch, 1);
            } else {
                hm.put(ch, hm.get(ch) + 1);
            }
        }

        int si = 0;
        int ei = -1;          // ← -1 so "not found" case works correctly
        int count = t.length();
        int i = 0;
        int minLen = Integer.MAX_VALUE;   // ← safer than s.length()

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);

            // EXPAND
            if (hm.containsKey(ch)) {
                if (hm.get(ch) > 0) count--;
                hm.put(ch, hm.get(ch) - 1);
            }

            // SHRINK
            while (count == 0) {
                int currLen = j - i + 1;
                if (currLen < minLen) {
                    minLen = currLen;
                    si = i;
                    ei = j;
                }

                char leftCh = s.charAt(i);
                if (hm.containsKey(leftCh)) {
                    hm.put(leftCh, hm.get(leftCh) + 1);
                    if (hm.get(leftCh) > 0) count++;
                }
                i++;
            }                          // ← closes while
        }                              // ← closes for

        return ei == -1 ? "" : s.substring(si, ei + 1);
    }                                  // ← closes method
}