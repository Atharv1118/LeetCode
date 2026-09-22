class Solution {
    public int lastStoneWeight(int[] stones) {

        ArrayList<Integer> list = new ArrayList<>();

        // Put all stones into ArrayList
        for (int stone : stones) {
            list.add(stone);
        }

        while (list.size() > 1) {

            // Find largest stone
            int largestIndex = 0;

            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > list.get(largestIndex)) {
                    largestIndex = i;
                }
            }

            // Remove largest stone
            int largest = list.remove(largestIndex);

            // Find second largest stone
            int secondLargestIndex = 0;

            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > list.get(secondLargestIndex)) {
                    secondLargestIndex = i;
                }
            }

            // Remove second largest stone
            int secondLargest = list.remove(secondLargestIndex);

            // If stones are different, put the difference back
            if (largest != secondLargest) {
                list.add(largest - secondLargest);
            }
        }

        // If one stone remains, return it
        if (list.size() == 1) {
            return list.get(0);
        }

        return 0;
    }
}