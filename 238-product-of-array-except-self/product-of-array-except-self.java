class Solution {
    public int[] productExceptSelf(int[] nums) {

        if(nums.length < 2)return nums;

        int[] left_right = new int[nums.length];
        int[] right_left = new int[nums.length];
        int[] ans = new int[nums.length];

        int multiplier = 1;
        for(int i=0;i<nums.length;i++){ 
             left_right[i] = nums[i]*multiplier;
             multiplier = left_right[i];
        }
        multiplier = 1; //reset to 1
        for(int i=nums.length-1;i>=0;i--){

             right_left[i] = nums[i]*multiplier;
             multiplier = right_left[i];
        }

        //prefix and suffix is ready
        ans[0] = 1 * right_left[1];
        ans[nums.length-1] = left_right[nums.length-2];

        if(nums.length>2){ 
            for(int i=1;i<nums.length-1;i++){ 
                 
                   ans[i] = left_right[i-1]*right_left[i+1];
            
             }
        }

        return ans;

    }
}  
