class Solution {
    public int findDuplicate(int[] nums) {

       int length = nums.length;
       boolean[] map = new boolean[length];

       for(int i=0;i<length;i++){ 
           if(map[nums[i]]){
                System.gc();
               return nums[i];
           }
           map[nums[i]]=true;
       }

       return 0;

    }
}