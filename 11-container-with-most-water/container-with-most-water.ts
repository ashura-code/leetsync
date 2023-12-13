function maxArea(height: number[]): number {


    let left_i = 0;
    let right_i = height.length-1;
    let max_water = 0;

    while(right_i > left_i){ 

        let area =0;

         if(height[left_i]>height[right_i]){ 
             area = height[right_i]*(right_i - left_i);
             right_i--;
         }
         else if(height[left_i]<height[right_i]){ 
             area = height[left_i]*(right_i - left_i);
             left_i++;
         }
         else{ 
              area = height[right_i]*(right_i - left_i);
              left_i++;
              right_i--;
         }
         
         if(area > max_water){ 
              max_water = area;
         }
         
    }

    return max_water;


    


    
};