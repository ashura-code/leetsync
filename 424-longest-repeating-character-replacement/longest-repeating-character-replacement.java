class Solution {
    public int characterReplacement(String s, int k) {
        int max_freq = 0;
        int count[] = new int[26]; 
        char[] arr = s.toCharArray(); // Corrected variable name
        int left = 0; // Added initialization for left pointer
        int ans = 0;

        for (int right = 0; right < arr.length; right++) { 
            count[arr[right]-'A']++;
            max_freq = Math.max(max_freq, count[arr[right]-'A']);

            if (right - left + 1 - max_freq > k) { 
                count[arr[left]-'A']--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
