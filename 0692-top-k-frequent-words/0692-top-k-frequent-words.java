class Solution {
    public List<String> topKFrequent(String[] words, int k) {

       HashMap<String , Integer> mpp = new HashMap<>();

       PriorityQueue<String> pq = new  PriorityQueue<>(
        (a , b) -> {
        if(!mpp.get(a).equals(mpp.get(b))){
            return mpp.get(b) - mpp.get(a); // if freq are different 
        }
        return a.compareTo(b); // if frequencies are same , alphabetical order
        }
       );

       for(int i =0; i<words.length ; i++){

        mpp.put(words[i] , mpp.getOrDefault(words[i] , 0) + 1);
       
       }

       //add all keys into pq 
       for(String word : mpp.keySet()){
            pq.add(word);
       }
       
       ArrayList<String> ls = new ArrayList<>();
       for(int i=0; i<k ; i++){
        ls.add(pq.poll());
       }
       return ls;
    }
}