class Solution {
    public int lengthOfLongestSubstring(String s) {

        List<Character> hset = new ArrayList<>();
        int max_value = 0;


        for (int right = 0; right < s.length(); right++) {

            if (hset.contains(s.charAt(right))) {
                // index
                int index = hset.indexOf(s.charAt(right));

                hset.remove(index);
                if (index > 0) {
                    hset.subList(0, index).clear();
                }

            }

            hset.add(s.charAt(right));
            max_value = Math.max(max_value, hset.size());

        }

        return max_value;

    }
}
