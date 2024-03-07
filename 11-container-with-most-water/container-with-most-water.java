class Solution {
    public int maxArea(int[] height) {

        int left_i = 0;
        int right_i = height.length-1;
        int max_water = Integer.MIN_VALUE;

        while(left_i < right_i){
            int distance = right_i - left_i;
            int tall = Math.min(height[left_i],height[right_i]);
            int area = distance*tall;
            max_water = Math.max(max_water,area);
            if(height[left_i]>=height[right_i]) {
                 right_i--;
            }else{
                left_i++;
            }
        }

        return  max_water;




        
    }
}