class Solution {
    public int findMin(int[] nums) {

        if(nums[0]<=nums[nums.length-1]) {
             return nums[0];
        }

        int left = 0;int right = nums.length-1;

        while(left <= right){ 
             if(nums[left] <= nums[right]) { 
                 return nums[left];
             }

             int mid = (right-left)/2+left;

             if(nums[mid] >= nums[right]){ 
                 left = mid+1;
             }
             else{ 
                 right=mid;
             }

        }

        return 0;

    }
}
