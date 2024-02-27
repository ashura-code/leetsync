class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int s_array_i = -1;
        int m = matrix.length;
        int n = matrix[0].length;


         for(int i=0;i<m;i++) {
             int curr = matrix[i][0];
             if(curr == target){ 
                  return true;
             }
             if(curr > target){ 
                  s_array_i = i-1;
                  break;
             }

         }

       if (s_array_i < 0) {
            s_array_i = m-1;
        }


         int l = 0;
         int r = n-1;

         while(l<=r){ 

             int mid = (l+r)/2;
             if(target > matrix[s_array_i][mid]){ 
                  l = mid+1;
             }
             else if(target < matrix[s_array_i][mid]){
                 r = mid-1;
             }
             else{
                return true;
             }
              
         }

         return false;
        
    }
}