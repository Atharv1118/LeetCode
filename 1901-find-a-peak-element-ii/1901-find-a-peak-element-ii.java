class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low = 0 , high = mat[0].length-1;
        int m = mat.length;
        int n = mat[0].length;
        while(low <= high){
            int mid = low +(high - low)/2;
            // For finding Max ele from mid col     
            int maxRow = 0;
            for(int i=1; i<m ; i++){
                if( mat[i][mid] > mat[maxRow][mid]){
                    maxRow = i;
                }
            }
            // find the left and right element of maxEle
            int left = (mid - 1 >= 0)? mat[maxRow][mid - 1] : -1;
            int right = (mid + 1 < n) ? mat[maxRow][mid + 1] : -1;
            if(mat[maxRow][mid] > left && mat[maxRow][mid] > right){
                return new int[]{maxRow , mid};
            }
            else if(mat[maxRow][mid - 1] > mat[maxRow][mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
    }
    return new int[]{-1 , -1};
}
}