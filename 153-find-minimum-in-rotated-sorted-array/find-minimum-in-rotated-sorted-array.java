class Solution {
    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length-1;

        while(left <= right) {
             if(nums[left] <= nums[right])return nums[left];

             int mid = left + (right-left)/2;

             if(nums[left] > nums[mid])right = mid;
             else left = mid+1;
        }

        return 0 ;
  
    }
}
