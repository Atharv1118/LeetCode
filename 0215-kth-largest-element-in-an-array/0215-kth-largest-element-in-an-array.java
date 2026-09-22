class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(
        (a , b) -> b - a
       );

        for(int num : nums){
            pq.add(num);
        }
        int cnt = 1;
        while(cnt <= k){
           if(cnt == k){
            return pq.poll();
           }
            pq.poll();
            cnt++;
        }
        return 0;
    }
}