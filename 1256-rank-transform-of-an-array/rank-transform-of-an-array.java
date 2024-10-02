class Solution {
    public int[] arrayRankTransform(int[] arr) {

       if(arr.length <= 0) return new int[]{};


        int[] temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp);
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(temp[0],1);
        int rank =2;
        for(int i=1;i<temp.length;i++){ 
             if(temp[i]==temp[i-1])continue;
             else{ 
                map.put(temp[i],rank);
                rank++;
             }
        }

        int[] ranks = new int[arr.length];

        for(int i=0;i<ranks.length;i++){ 
             ranks[i] = map.get(arr[i]);
        }

        return ranks;


    }
}