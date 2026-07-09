// Last updated: 7/9/2026, 9:12:01 AM
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows=mat.length;
        int cols=mat[0].length;
        if(rows*cols!=r*c){
            return  mat;
        }
        int a[][]=new int[r][c];
        for(int i=0;i<rows*cols;i++){
            a[i/c][i%c]=mat[i/cols][i%cols];
        }
        return a;
    }
}