class Solution {
    public int[][] onesMinusZeros(int[][] grid) {

        int[] RowOnes = new int[grid.length];
        int[] ColOnes = new int[grid[0].length];


        for(int i=0;i<grid.length;i++){  //row
             for(int j=0;j<grid[0].length;j++){  //column
                  
                  RowOnes[i] += grid[i][j];
                  ColOnes[j] += grid[i][j];
             }
        }

        for(int i=0;i<grid.length;i++){
             for(int j=0;j<grid[0].length;j++){ 
                   
                    grid[i][j] = 2*(RowOnes[i]+ColOnes[j]) - grid[0].length - grid.length;
             }
        }     

        return grid;  
    }
}