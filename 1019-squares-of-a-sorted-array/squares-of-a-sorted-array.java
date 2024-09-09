class Solution {
    public int[] sortedSquares(int[] nums) {

        int l = 0;
        int r = nums.length -1;
        int index = r;

        int[] new_arr = new int[nums.length];

        while(l <= r) {
             int sqr = nums[r]*nums[r];
             int sql = nums[l]*nums[l];

             if(sqr > sql) {
               new_arr[index] = sqr;
               r--;
             }
             else{ 
                 new_arr[index] = sql;
                 l++;
             }
             index--;
        }

        return new_arr;


        
  
    }
}