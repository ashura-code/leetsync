class Solution {
    public int largestAltitude(int[] gain) {

        ArrayList<Integer> alt_points = new ArrayList<>();
        alt_points.add(0);

        for(int i=0;i<gain.length;i++){ 
             alt_points.add(alt_points.get(i)+gain[i]);
        }  


        return Collections.max(alt_points);


    }
}