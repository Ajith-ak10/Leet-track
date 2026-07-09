// Last updated: 7/9/2026, 9:11:23 AM
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int l=original.length;
        if(l!=m*n){
            return new int[0][0];
        }
        int a[][]=new int[m][n];
        for(int i=0;i<l;i++){
            a[i/n][i%n]=original[i];
        }
        return a;
    }
}