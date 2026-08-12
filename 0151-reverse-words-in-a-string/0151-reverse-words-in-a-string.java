class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder rev = new StringBuilder(s);
        rev.reverse();
        for(int i=0; i<rev.length(); i++){
            StringBuilder word = new StringBuilder();
            while(i<rev.length() && rev.charAt(i) != ' '){
                word.append(rev.charAt(i));
                i++;
            }
            if(word.length() > 0){
               word.reverse();
               if(ans.length() > 0){
                ans.append(" ");
               }
               ans.append(word);
            }
        }
        return ans.toString();
    }
}