class Solution {
    public int findDuplicate(int[] nums) {

       int length = nums.length;
       int[] map = new int[length];

       for(int i=0;i<length;i++){ 
           if(map[nums[i]]==1){
               return nums[i];
           }
           else{
             map[nums[i]]=1;
           }
       }

       return 0;

        
    }
}