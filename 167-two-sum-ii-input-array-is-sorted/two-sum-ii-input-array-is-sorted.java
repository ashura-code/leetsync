// class Solution {
//     public int[] twoSum(int[] numbers, int target) {

//         for(int i=0;i<numbers.length;i++){ 

//                 int search = target-numbers[i];

//                 for(int j=0;j<numbers.length;j++){

//                     if(i==j){
//                           continue;
//                     }

//                     if(numbers[j]==search){ 
//                     return new int[]{i+1,j+1};
//                 }
                     
//                 }
                

//         }

//         return new int[]{0};
        
//     }
// }

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{0};
    }
}
