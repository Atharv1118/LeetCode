class Solution {
    public int longestMountain(int[] arr) {

        int ans = 0;
        int n = arr.length;

        for(int i = 1; i<=n - 2; i++){

            int cnt = 0;
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                cnt = 1;
                int j = i;
                while(j > 0 && arr[j] > arr[j - 1]){
                     
                     j--;
                     cnt++;
                } 

                int k = i;
                while(k < n -1 && arr[k] > arr[k + 1]){

                    k++;
                    cnt++;
                }
                ans = Math.max(ans , cnt);
            }
          
        }
          return ans;
    }
}