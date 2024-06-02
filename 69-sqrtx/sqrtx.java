class Solution {
    public int mySqrt(int x) {

    if(x < 2)return x;

    int l = 1;
    int r = x;
    int res = 0;

    while(l<=r){ 
        int mid = l + (r-l)/2;
        long square = (long) mid * mid;

        if(square > x)r = mid-1;
        else if(square < x){
            l = mid+1;
            res = mid;
            }
        else return mid;
    }

    return res;

        
    }
}