class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();


        for(int i = 0;i<nums.length;i++){ 
            if(i>0 && nums[i]==nums[i-1])continue;
            for(int j = i+1;j<nums.length;j++){ 
                if(j>i+1 && nums[j]==nums[j-1])continue;
                 int l = j+1;
                 int r = nums.length-1;
                 long need =(long)target - (long)nums[i]-(long)nums[j];

                 while(l<r){ 
                     if((long)nums[l]+(long)nums[r] == need){ 
                          List<Integer> temp = new ArrayList<>();
                          temp.add(nums[i]);
                          temp.add(nums[j]);
                          temp.add(nums[l]);
                          temp.add(nums[r]);
                          res.add(temp);
                          l++;r--;
                          while(l<r && nums[l]==nums[l-1])l++;
                          while(l<r && nums[r]==nums[r+1])r--;

                     }
                     else if((long)nums[l]+(long)nums[r] > need){ 
                         r--;
                     }else l++;
                 }


            }
        }

        return res;
 
    }
}