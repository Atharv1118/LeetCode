class Solution {

    public boolean isPossible(int[] bloomDays, int day, int m, int k) {

        int count = 0;
        int bouquets = 0;

        for (int bloom : bloomDays) {

            if (bloom <= day) {
                count++;

                if (count == k) {
                    bouquets++;
                    count = 0;
                }

            } else {
                count = 0;
            }
        }

        return bouquets >= m;
    }

    public int minDays(int[] bloomDays, int m, int k) {

        long totalFlowers = (long) m * k;

        if (totalFlowers > bloomDays.length) {
            return -1;
        }

        int min = Arrays.stream(bloomDays).min().getAsInt();
        int max = Arrays.stream(bloomDays).max().getAsInt();

        int low = min;
        int high = max;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(bloomDays, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}