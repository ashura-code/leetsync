class Solution {
    public int maxArea(int[] height) {

        // int left_i = 0;
        // int right_i = height.length - 1;
        // int max_water =0;

        // while(left_i < right_i){ 
        //     int left = height[left_i];
        //     int right = height[right_i];
        //     int area = 0;

        //     if(left < right){ 
        //          area = left*(right_i - left_i);
        //          left_i++;
        //     }
        //     else if(left > right){ 
        //          area = right*(right_i - left_i);
        //          right_i--;
        //     }
        //     else{ 
        //         area = left*(right_i - left_i);
        //         left_i++;
        //         right_i--;
        //     }
           
        //      if (area > max_water){
        //              max_water = area;
        //      }


        // }

        // return max_water;


        int max_water = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right){
            int curr_height = Math.min(height[left],height[right]);
            int curr_width = right-left;
            int curr_water = curr_height * curr_width;

            if(curr_water  > max_water){ 
                 max_water = curr_water;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            

        }

        return max_water;




    }
}