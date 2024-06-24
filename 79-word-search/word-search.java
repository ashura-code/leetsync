class Solution {
    private char[][] board;
    private int ROWS;
    private int COLS;
      
    public boolean exist(char[][] board, String word) {
         this.board = board;
         this.ROWS = board.length;
         this.COLS = board[0].length;
        for(int i=0;i<ROWS;i++){ 
             for(int j = 0 ;j<COLS;j++){ 
                 if(dfs(i,j,0,word))return true;
             }
        }

        return false;
    
    }
        public  boolean dfs(int r , int c,int i,String word ){ 

            if(i == word.length())return true;

            if(r < 0 || r >= ROWS || c < 0 || c >= COLS || word.charAt(i)!=board[r][c]){ 
                 return false;
            } 
              char temp = board[r][c];
              board[r][c] = '*'; 

            boolean res = dfs(r+1,c,i+1,word)||dfs(r-1,c,i+1,word)||dfs(r,c+1,i+1,word)||dfs(r,c-1,i+1,word);

            board[r][c] = temp; 


            return res;
             
        }
}