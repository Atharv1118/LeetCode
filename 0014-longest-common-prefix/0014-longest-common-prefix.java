class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        // After sorting we hav just to check 1st and last word 
        char[] first = strs[0].toCharArray();// get the 1st word
        char[] last = strs[strs.length -1].toCharArray();// get the last word

        // now compare
        for(int i=0; i<first.length; i++){
            if(first[i] != last[i]){
                break;
            }
            else{
                ans.append(first[i]);
            }
        }
        return ans.toString();
    }
}