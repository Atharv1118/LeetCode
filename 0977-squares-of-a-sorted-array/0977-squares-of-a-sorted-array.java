class Solution {
    public int[] sortedSquares(int[] nums) {
        
    int left = 0;
    int right = nums.length - 1;
    int ans[] = new int[nums.length];
    int index = nums.length - 1;


    while(left <= right){

      int leftMost = Math.abs(nums[left] * nums[left]);
      int rightMost = Math.abs(nums[right] * nums[right]);

      if(leftMost > rightMost){

        ans[index] = leftMost;
        left++;

      }
      else{

        ans[index] = rightMost;
        right--;
        
    }

      index--;

    }
        return ans;
    }
}