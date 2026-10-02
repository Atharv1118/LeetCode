class Solution {
    public char findTheDifference(String s, String t) {
        
        int[] ans = new int[26];
        
        for(char c : t.toCharArray()){
            ans[c - 'a']++;
        }
         for(char c : s.toCharArray()){
            ans[c - 'a']--;
        }
        for(char c : t.toCharArray()){
            if(ans[c - 'a'] > 0){
              return c;
            }
        }
      return ' ';
    }
}