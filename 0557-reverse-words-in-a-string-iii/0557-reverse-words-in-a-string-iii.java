class Solution {
    public String reverseWords(String s){
        
        char[] arr = s.toCharArray();
        int left = 0;
        int right = 0;

        for(int i=0; i<arr.length; i++){

            if(arr[i] == ' '){

                reverse(arr , left , i - 1);
                left = i + 1;
            }
        }

        reverse(arr , left , arr.length - 1);

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


