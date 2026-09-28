class Solution {
    public int[] singleNumber(int[] nums) {
        
       HashMap<Integer , Integer> mpp = new HashMap<>();
       int[] ans = new int[2]; 
       for(int num : nums){
        mpp.put(num , mpp.getOrDefault(num , 0) + 1);
       }
       int k=0;
       for(int i=0; i<nums.length; i++){
        if(mpp.get(nums[i]) == 1){
            ans[k] = nums[i];
            k++;
        }
       }
       return ans;

    }
}