class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int cnt = 0;
        for(int[] row : matrix){
            for(int col : row){
            pq.add(col);
            }
        }
        int ans = 0;
        for(int i = 0; i<k ; i++){
             ans = pq.poll();
        }
        return ans;
    }
}