import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Construct the bucket
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            bucket[frequency].add(key);
        }

        // Step 3: Get the top k frequent elements from the bucket
        List<Integer> result = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && result.size() < k; i--) {
            result.addAll(bucket[i]);
        }

        // Convert the result to an array
        int[] topK = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            topK[i] = result.get(i);
        }
        return topK;
    }
}
