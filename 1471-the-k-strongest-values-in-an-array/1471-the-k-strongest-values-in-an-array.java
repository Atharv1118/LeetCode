class Solution {
    public int[] getStrongest(int[] arr, int k) {
        
        Arrays.sort(arr);
        int n = arr.length;
        int median = arr[(n - 1)/2];
    
        int low =0;
        int high = n-1;

        int[] ans = new int[k];
        int index = 0;

        while(index < k){

            int leftLargest = Math.abs(arr[low] - median);
            int rightLargest = Math.abs(arr[high] - median);

            if(leftLargest > rightLargest){

                ans[index] = arr[low];
                index++;
                low++;
            }
            else{

                ans[index] = arr[high];
                index++;
                high--;
            }
        }
       return ans;
    }
}