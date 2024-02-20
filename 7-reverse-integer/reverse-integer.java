class Solution {
    public int reverse(int x) {
        int neg = 1;
        if (x < 0) { 
            x = -x;
            neg = -1;
        } else if (x == 0) { 
            return 0;
        }
        
        int ans = 0;
        while (x > 0) { 
            int curr = x % 10;
            
            // Check for overflow before updating ans
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && curr > 7))
                return 0; // Overflow occurred
            
            ans = ans * 10 + curr;
            x = x / 10;
        }
        
        return ans * neg;
    }
}
