class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
       
        for(int i=0;i<nums.length-2;i++){ 
            if (i>0 && nums[i] == nums[i - 1]) continue;
            
            int l = i+1;
            int r = nums.length-1;
            int need = -1 * nums[i];
            while(l<r){   
                if(nums[l]+nums[r] == need){ 
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    temp.add(nums[i]);
                    ans.add(temp);
                    l++;r--;
                    while(l<r && nums[l]==nums[l-1])l++;
                    while(l<r && nums[r]==nums[r+1])r--;
                }
                else if(nums[l]+nums[r]>need){ 
                     r--;
                }else{ 
                    l++;
                }
                 
            }
             
        }
        return ans;
    }
}
