class Solution {
    public void moveZeroes(int[] nums) {


        int i=0;
        int j=0;
        int n = nums.length;

    

        while(i < nums.length && j < nums.length){ 
             
             if(nums[i]!=0){ 
                  i++;
             }
             if(nums[j]==0){
                  j++;
             }

             if((i<n && j<n) && i < j){ 
                 nums[i] = nums[i] ^ nums[j];
                 nums[j] = nums[i] ^ nums[j];
                 nums[i] = nums[i] ^ nums[j];
             }
             j++;
        }






        
        
   
    }
}