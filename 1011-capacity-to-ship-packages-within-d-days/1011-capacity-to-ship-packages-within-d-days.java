class Solution {
    private int calculateCapacity(int[] weights ,int cap){
        int load = 0 , day = 1;
        for(int i =0;i<weights.length; i++){
            if(weights[i] + load >cap){
                day += 1;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
       int maxweight = Integer.MIN_VALUE;
       int maxsum = 0;
       for(int i = 0;i<weights.length;i++){
        maxweight = Math.max(maxweight , weights[i]);
        maxsum += weights[i];
       } 
       int low = maxweight;
       int high = maxsum;
       while(low <= high){
        int mid = low +(high - low)/2;
        int minCap = calculateCapacity(weights , mid);
        if(minCap <=days ){
            high = mid - 1;
        }
        else{
            low = mid + 1;
        }
       }
       return low;
    }
}