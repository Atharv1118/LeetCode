class Solution {
    public Boolean checkPalindrome(String s, int i , int j){

        while(i < j){

            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i=0; i<s.length(); i++){
            
            for(int j=i; j<s.length(); j++){

                if(checkPalindrome( s,  i ,  j)){

                    if(j +1 - i > ans.length()){
                        
                    ans = s.substring(i , j+1);
                    }
                }
            }

        }
        return ans;
    }
}