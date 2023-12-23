class Solution {
    public boolean isPathCrossing(String path) {

        Set<String> visited = new HashSet<>();
        visited.add("0,0");

        int x = 0;
        int y = 0;
           
          for(char dir:path.toCharArray()){ 
               if(dir == 'N'){ 
                    y++;
               }
               else if(dir == 'E'){ 
                   x++;
               }
               else if(dir =='W'){ 
                   x--;
               }
               else if(dir =='S'){ 
                   y--;
               }

               String current_pos =  x + "," + y;

               if (visited.contains(current_pos)) {
                    return true;
               }
               else{
                   visited.add(current_pos);
               }

               }

        
        return false;
        
    }
}