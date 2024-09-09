class Solution {
    public int diagonalSum(int[][] mat) {

        int mid_element = mat.length%2==0 ? -1 : (int)Math.ceil(mat.length/2);

        int sum = 0;

        for(int i=0;i<mat.length;i++){ 
            sum = sum + mat[i][i] + mat[i][mat.length-i-1];
        }
        return mid_element==-1 ? sum   : sum - mat[mid_element][mid_element];
    }
}