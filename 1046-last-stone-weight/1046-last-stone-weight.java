class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a , b) -> b - a
        );
       
        for(int i = 0; i<stones.length ; i++){

            pq.add(stones[i]);

        }
        while(pq.size() > 1){

            int largest = pq.poll();
            int seclargest = pq.poll();

            if(largest != seclargest){
                pq.add(largest - seclargest);
            }
        }
        if(!pq.isEmpty()){
            return pq.poll();
        }
        return 0;
    }
}