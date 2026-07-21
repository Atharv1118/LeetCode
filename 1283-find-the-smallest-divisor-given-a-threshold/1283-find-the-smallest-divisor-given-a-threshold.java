class Solution {
    private long totalDiv(int[] nums,int divisor){
        long sum = 0;
        for(int i =0;i < nums.length;i++){
            sum += (nums[i] + divisor-1) / divisor;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int maxnum = nums[0];
        for(int i=1 ; i<nums.length;i++){
             maxnum = Math.max(maxnum , nums[i]);
        }
        int low = 1;
        int high = maxnum;
        int ans = maxnum;
        while(low <= high){
            int mid = low +(high - low)/2;
            long result = totalDiv(nums , mid);
            if(result <= threshold){
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