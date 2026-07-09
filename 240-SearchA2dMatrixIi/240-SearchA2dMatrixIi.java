// Last updated: 7/9/2026, 9:12:36 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int f=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(target==matrix[i][j]){
                    f=1;
                    break;
                }
            }
            if(f==1){
                break;
            }
        }
        return(f==1);
    }
}