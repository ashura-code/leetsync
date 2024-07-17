class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length ==0 )return 0;

        Arrays.sort(nums);

        int longest = 1;
        int max_long = 1;

        for(int i=0;i<nums.length-1;i++) {
             if(nums[i]==nums[i+1])continue;
             if(nums[i]+1 == nums[i+1]){
                 longest++;
             }
             else{ 
                 max_long = Math.max(longest,max_long);
                 longest = 1;
             }
        }

        return Math.max(max_long,longest);
        
    }
}
