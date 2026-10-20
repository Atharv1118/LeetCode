class Solution {
    public int maxOperations(int[] nums, int k) {

    Arrays.sort(nums);

    int left = 0;
    int right = nums.length - 1;

    int pairs =0;

    while(left < right){

        if(nums[left] + nums[right] == k){

            pairs++;
            left++;
            right--;
        }
        else if(nums[left] + nums[right] < k){
            left++;
        }
        else{
            right--;
        }
    }
    return pairs;    
    }
}