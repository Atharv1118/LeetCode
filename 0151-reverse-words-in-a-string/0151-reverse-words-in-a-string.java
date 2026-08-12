class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();

        int right = s.length() - 1;

        while (right >= 0) {

            // Skip spaces
            while (right >= 0 && s.charAt(right) == ' ') {
                right--;
            }

            if (right < 0) {
                break;
            }

            // Find the starting position of the word
            int left = right;

            while (left >= 0 && s.charAt(left) != ' ') {
                left--;
            }

            // Add space between words
            if (ans.length() > 0) {
                ans.append(" ");
            }

            // Add current word
            ans.append(s.substring(left + 1, right + 1));

            // Move to previous word
            right = left - 1;
        }

        return ans.toString();
    }
}