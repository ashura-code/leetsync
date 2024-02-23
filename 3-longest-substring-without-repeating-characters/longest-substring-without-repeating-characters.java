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


// loop through the string
// add chars to set/arrlist until it finds a duplicate
//find the original character's index in the set/arrlist
// remove elements from index 0 to the og character's index including og char
// now add the duplicate value to the arraylist which is not a duplicate anymore.
//now compare with the max_value and size of the set/arrlist
// return max value after the loop is completed.