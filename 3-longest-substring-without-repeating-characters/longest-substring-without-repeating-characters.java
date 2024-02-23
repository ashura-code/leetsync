import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> set = new ArrayList<>();
        int max_value = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (set.contains(currentChar)) {
                // Find the index of the duplicate character
                int index = set.indexOf(currentChar);
                // Remove all elements up to the duplicate character (including it)
                for (int i = 0; i <= index; i++) {
                    if (!set.isEmpty()) { // Check if list is not empty
                        set.remove(0);
                    }
                }
            }

            set.add(currentChar);
            max_value = Math.max(max_value, set.size());
        }

        return max_value;
    }
}
