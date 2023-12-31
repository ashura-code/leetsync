// function maxArea(height: number[]): number {

//    let left_i = 0
//    let right_i = height.length-1
//    let max_water = 0

//    while(left_i < right_i){ 
//         let area = Math.min(height[left_i],height[right_i])*(right_i-left_i);
//         max_water = Math.max(max_water,area);

//          height[left_i]<height[right_i] ? left_i++ : right_i--;
//    }

//    return max_water
    
// };





function maxArea(height: number[]): number {
    let maxWater = 0;

    let left = 0
    let right = height.length - 1
    
    while(left < right){
        let water = Math.min(height[left], height[right]) * (right - left);
        maxWater = Math.max(maxWater, water);
        
        height[left] < height[right] ? left++ : right--;
    }

    return maxWater
};
    
        