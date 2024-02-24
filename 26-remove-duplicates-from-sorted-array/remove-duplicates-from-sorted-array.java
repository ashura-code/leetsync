import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        int uniqueIndex = 0;

        for (int i : nums) {
            if (set.add(i)) {
                nums[uniqueIndex++] = i;
            }
        }

        return uniqueIndex;
    }
}
