class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // Anagrams must have the same length
        }

        int[] counts = new int[26]; // Assuming input consists of lowercase English letters

        // Count occurrences in string s
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }

        // Add occurrences in string t and check for even occurrences
        for (char c : t.toCharArray()) {
            if (--counts[c - 'a'] < 0) {
                return false; // More occurrences of c in t than in s
            }
        }

        // Check if all counts are even
        for (int count : counts) {
            if (count % 2 != 0) {
                return false; // Odd occurrence found
            }
        }

        return true; // All characters in s and t match
    }
}
