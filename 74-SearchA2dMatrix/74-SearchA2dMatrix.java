// Last updated: 7/9/2026, 9:13:12 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int f=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(target==matrix[i][j]){
                    f=1;
                    break;
                }
            }
            if(f==1){
                break;
            }
        }
        return (f==1);
    }
}