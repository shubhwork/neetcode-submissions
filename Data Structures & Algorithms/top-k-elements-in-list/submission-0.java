class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       
        // Step 1: Frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        // Step 2: Min Heap based on frequency
        PriorityQueue<Integer> pq =
                new PriorityQueue<>((a, b) -> freqMap.get(a) - freqMap.get(b));

        for (int num : freqMap.keySet()) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Step 3: Build result
        int[] result = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            result[i++] = pq.poll();
        }

        return result;
    }
}
