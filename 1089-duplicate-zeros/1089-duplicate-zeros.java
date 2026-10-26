class Solution {
    public void duplicateZeros(int[] arr) {

        int zeros = 0;
        int n = arr.length;

        // Pass 1: Count zeros
        for (int num : arr) {
            if (num == 0) {
                zeros++;
            }
        }

        // Pass 2: Process from right to left
        int i = n - 1;
        int j = n + zeros - 1;

        while (i < j) {

            if (j < n) {
                arr[j] = arr[i];
            }

            if (arr[i] == 0) {
                j--;

                if (j < n) {
                    arr[j] = 0;
                }
            }

            i--;
            j--;
        }
    }
}