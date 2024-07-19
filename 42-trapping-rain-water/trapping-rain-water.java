class Solution {
    public int trap(int[] height) {

        if(height.length == 0)return 0;

        int left = 0;
        int right = height.length-1;

        int lmax_val = height[left];
        int rmax_val = height[right];
        int res = 0;

        while(left < right) {
             
             if(lmax_val < rmax_val){left++;lmax_val = Math.max(lmax_val,height[left]);res += lmax_val-height[left];}
             else {right--;rmax_val = Math.max(rmax_val , height[right]);res += rmax_val - height[right];}

        }

        return res;

    }
}
