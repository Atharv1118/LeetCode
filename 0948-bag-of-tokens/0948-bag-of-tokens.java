class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {

     Arrays.sort(tokens);

     int left = 0;
     int right = tokens.length - 1;

    int maxScore =0;
     int score = 0;

     while(left <= right){

        if(tokens[left] <= power){

            power -= tokens[left];
            score = score + 1;
            left++;
            maxScore = Math.max(maxScore, score);
        }
        else if(score > 0 && left < right){

            power += tokens[right];
            right--;
            score = score - 1;
            
        }
        else{
            break;
        }
     } 
     return score;  
    }
}