class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int largest = 0;
        ArrayList<Boolean> result = new ArrayList<>();

        for(int i:candies){ 
             if(i >= largest){ 
                  largest = i;
             }
        }

        for(int i=0;i<candies.length;i++){
            result.add(candies[i] + extraCandies >= largest);
            //  if(candies[i]+extraCandies >= largest){ 
            //       result.add(true);
            //  }
            //  else{ 
            //      result.add(false);
            //  }
        }

        return result;


    }
}