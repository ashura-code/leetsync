class Solution {
    public List<List<Integer>> threeSum(int[] nums) { 

         
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        

        for(int i = 0;i<nums.length-2;i++){ 

            if(i > 0 && nums[i] == nums[i-1])continue;
            int left_i= i+1;
            int right_i = nums.length - 1;
            int need = -1*nums[i];

            while(left_i < right_i ){ 
                int sum = nums[left_i] + nums[right_i];
                if(sum < need ){ 
                     left_i++;
                }
                else if(sum >need){ 
                     right_i--;
                }
                else{ 
                    result.add(Arrays.asList(nums[i], nums[left_i], nums[right_i]));
                    left_i++;
                    right_i--;
                    while (left_i < right_i && nums[left_i] == nums[left_i - 1]) left_i++;
                    while (left_i < right_i && nums[right_i] == nums[right_i + 1]) right_i--;
                }
            }

        }


        return result;
        

    }
}
