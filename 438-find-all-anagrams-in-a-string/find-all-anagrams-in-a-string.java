class Solution {
    public static boolean match(int arr1[], int arr2[]){
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    return false;
                }
            }
            return true;
        }
    public List<Integer> findAnagrams(String s, String p) {
        // first store each character in array for s and p
        List<Integer> ans = new ArrayList<>();

        int n1 = s.length();
        int n2 = p.length();

        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for (int i = 0; i < n2; i++) {
            int idx = p.charAt(i) - 'a';
            arr2[idx]++;
        }

        // itearate on s and make a window
        // make a window freq array
        int j = 0;
        for (int i = 0; i < n1; i++) {
            int idx = s.charAt(i) - 'a';
            arr1[idx]++; // firstly 0 then inc
            // int win_len = i - j + 1;
            if(i - j + 1 > n2){
                // remove left char inside in arr1
                arr1[s.charAt(j) - 'a']--;
                j++;
            }

            if(i - j + 1 == n2){
                // check if match with arr2 or not
                if(match(arr1, arr2)){
                    // store j
                    ans.add(j);
                }
            }
        }
        return ans;
    }
}