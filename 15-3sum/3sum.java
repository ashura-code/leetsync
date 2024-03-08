class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++) {

            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int l = i+1;
            int r = nums.length-1;
            int need = -1*nums[i];

            while(l<r){ 
                 if(nums[l]+nums[r] > need) {
                      r--;
                 }else if(nums[l]+nums[r] < need){
                     l++;
                 }
                 else{
                      List<Integer> temp  = new ArrayList<>();
                      temp.add(nums[i]);
                      temp.add(nums[l]);
                      temp.add(nums[r]);
                      ans.add(temp);
                      l++;

                      while(l<r && nums[l] == temp.get(1))l++;
                      while(l<r && nums[r] == temp.get(2))r--;

                      
                 }
            }

        }

              return ans; 
    }
}