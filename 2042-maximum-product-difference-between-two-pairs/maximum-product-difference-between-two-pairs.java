class Solution {
    public int maxProductDifference(int[] nums) {

        int largest = 0;
        int largest_2 = 0;

        int smallest = 10000;
        int smallest_2 = 10000;

        for(int num:nums){
           if(num > largest_2){ 
                if(num >= largest){ 
                     largest_2 = largest;
                     largest = num;
                }
                else{
                    largest_2 =num;
                }
                
           }

           if(num < smallest_2){ 
                if(num <= smallest){ 
                     smallest_2 = smallest;
                     smallest = num;
                }
                else{
                    smallest_2 =num;
                }
                
           }

            
        }

        return (largest*largest_2)-(smallest*smallest_2);
    }
}