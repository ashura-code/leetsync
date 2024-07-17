class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();

        for(String word:strs){ 
            int[] identifier_arr = new int[26];
            
            for(char character: word.toCharArray()) { 
                  identifier_arr[character-'a']++;
            }
            
            String identifier = Arrays.toString(identifier_arr);

            map.putIfAbsent(identifier,new ArrayList<>());
            map.get(identifier).add(word);
        }

        return new ArrayList<>(map.values());
        
    }
}
