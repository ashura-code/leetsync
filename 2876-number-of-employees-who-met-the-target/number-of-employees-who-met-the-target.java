class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int emp_met = 0;

        for(int i=0;i<hours.length;i++) {
            if(hours[i]>=target){ 
                  emp_met++;
            }
        }

        return emp_met;
        
    }
}