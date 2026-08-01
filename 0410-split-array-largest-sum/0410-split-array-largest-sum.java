class Solution {
    boolean isPossible(int nums[] , int k , int mid){
        int sub_array = 1 , sum = 0;
        for(int i=0; i<nums.length; i++){
        if(sum + nums[i] <= mid){
            sum += nums[i];
        }
        else{
            sub_array++;
            sum = nums[i];
        }
    }
        if(sub_array <= k){
            return true;
        }
        else{
            return false;
        }
    }
    public int splitArray(int[] nums, int k) {
        int minele = Integer.MIN_VALUE;
        int maxele = 0;
        for(int i=0;i<nums.length; i++){
            minele = Math.max(minele , nums[i]);
            maxele += nums[i];
        } 
        int ans = -1;
        int low = minele , high = maxele;
        while(low <= high){
            int mid = low +  (high - low)/2;
            boolean result = isPossible(nums, k , mid);
            if(result == true){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}