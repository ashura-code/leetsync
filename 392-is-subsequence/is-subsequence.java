class Solution {
    public boolean isSubsequence(String s, String t) {

        char[] arr = t.toCharArray();
        char[] ref = s.toCharArray();
        int i = 0;
        int j = 0;

        while (j < arr.length) {
            if (i < ref.length) {
                if (ref[i] == arr[j]) {
                    i++;
                }
            }
            j++;
        }

        return i >= ref.length;
    }
}
