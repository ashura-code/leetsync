class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String a : strs) {
            String b = a;
            char[] temp = a.toCharArray();
            Arrays.sort(temp);
            a = new String(temp);

            if (!map.containsKey(a)) {
                ArrayList<String> list = new ArrayList<>();
                list.add(b);
                map.put(a, list);
            } else {
                map.get(a).add(b);
            }
        }

        // for(List<String> a:map.values()){

        // }

        return new ArrayList<>(map.values());

    }
}