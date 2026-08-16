class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Max Heap based on frequency
        PriorityQueue<Map.Entry<Character, Integer>> pq =
            new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
            );

        // Put all HashMap entries into PriorityQueue
        pq.addAll(map.entrySet());

        // Build answer
        StringBuilder ans = new StringBuilder();

        while (!pq.isEmpty()) {

            Map.Entry<Character, Integer> entry = pq.poll();

            char ch = entry.getKey();
            int freq = entry.getValue();

            for (int i = 0; i < freq; i++) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}