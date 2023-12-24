class Solution {
    public int minOperations(String s) {
        int count1 = 0; // Count of operations if we start with '1'
        int count2 = 0; // Count of operations if we start with '0'

        char[] charArray = s.toCharArray();

        // Check for starting with '1'
        for (int i = 0; i < charArray.length; i++) {
            char expected = (i % 2 == 0) ? '1' : '0';
            if (charArray[i] != expected) {
                count1++;
            }
        }

        // Check for starting with '0'
        for (int i = 0; i < charArray.length; i++) {
            char expected = (i % 2 == 0) ? '0' : '1';
            if (charArray[i] != expected) {
                count2++;
            }
        }

        // Return the minimum count
        return Math.min(count1, count2);
    }
}
