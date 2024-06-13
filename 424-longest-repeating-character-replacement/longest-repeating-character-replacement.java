class Solution {
    public int characterReplacement(String s, int k) {

        int[] arr = new int[26];
        int longest_substring = 0;

        int left = 0;
        int max_frequency_of_curr_window = 0;
        for(int right = 0; right < s.length() ; right++){ 
             arr[s.charAt(right) -  'A']++; // update the frequency on each rep
             max_frequency_of_curr_window = Math.max(max_frequency_of_curr_window , arr[s.charAt(right)- 'A']); // saving the character eith max frequency
             int length_of_curr_window = right - left +1;
             int minor_char_freq = length_of_curr_window - max_frequency_of_curr_window;

             if(minor_char_freq > k){
                 arr[s.charAt(left)-'A']--;
                 left++;
             }

             longest_substring = Math.max(longest_substring,right - left +1);

        } 

        return longest_substring;

    }
}