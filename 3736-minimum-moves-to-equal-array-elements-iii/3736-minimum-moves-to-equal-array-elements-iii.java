class Solution {
    public int minMoves(int[] nums) {

        int max = Integer.MIN_VALUE;

        // Find maximum element
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        long moves = 0;

        // Calculate total moves
        for (int j = 0; j < nums.length; j++) {
            moves += (long) max - nums[j];
        }

        return (int) moves;
    }
}