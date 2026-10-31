class Solution {
    public String reverseStr(String s, int k) {

        char[] arr = s.toCharArray();

        int left = 0;
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {

            cnt++;

            if (cnt == k) {
                reverse(arr, left, i);
            }

            if (cnt == 2 * k) {
                left = i + 1;
                cnt = 0;
            }
        }

        // Reverse remaining characters if fewer than k remain
        if (cnt > 0 && cnt < k) {
            reverse(arr, left, arr.length - 1);
        }

        return new String(arr);
    }

    public void reverse(char[] arr, int left, int right) {

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}