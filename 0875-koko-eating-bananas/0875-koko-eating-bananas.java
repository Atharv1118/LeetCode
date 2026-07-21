class Solution {

    private long calculateTotalHours(int[] piles, int speed) {
        long totalHours = 0;

        for (int pile : piles) {
            totalHours += (pile + speed - 1L) / speed;
        }

        return totalHours;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int maxPile = piles[0];
        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }

        int low = 1;
        int high = maxPile;
        int ans = maxPile;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long totalHours = calculateTotalHours(piles, mid);

            if (totalHours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}