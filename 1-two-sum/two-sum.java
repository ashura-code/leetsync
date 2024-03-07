class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] ans = new int[2];

        // for(int i:nums){
        //     arr.add(i);
        // }

        for(int i=0;i<nums.length;i++){

                 
                  int curr = nums[i];
                  int need = target - curr;

                  if(arr.contains(need)) {
                       ans[0] = i;
                       ans[1] = arr.indexOf(need);
                       return ans;
                  }
                  arr.add(nums[i]);
             
              
               
        }

        return ans;

    }
}