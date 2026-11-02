class Solution {
    public int minMoves2(int[] nums) {

      long moves = Integer.MAX_VALUE;
       
      for(int i=0; i<nums.length; i++){

       long diff = 0;

        for(int j=0; j<nums.length; j++){

            diff += Math.abs(nums[i] - nums[j]);
        
        }
        moves = Math.min(moves , diff);
      }  
      return (int)moves;
    }
}