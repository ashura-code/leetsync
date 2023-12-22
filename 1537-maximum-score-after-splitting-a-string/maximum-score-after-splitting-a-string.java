class Solution {
    public int maxScore(String s) {

        int left_score = 0;
        int right_score = 0;
        int maxScore = 0;

        for(char num:s.toCharArray()){ 
             if(num == '1'){
                 right_score++;
             }
        }

        for(int i =0;i<s.length()-1;i++){  
            if(s.charAt(i)=='0'){ 
                 left_score++;
            }
            else{ 
                 right_score--;
            }
            maxScore = Math.max(maxScore,left_score+right_score);

        }

        return maxScore;
    }
}


