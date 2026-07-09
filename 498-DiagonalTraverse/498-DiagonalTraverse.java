// Last updated: 7/9/2026, 9:12:09 AM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        int ans[]=new int[rows*cols];
        int index=0;
        for(int d=0;d<rows+cols-1;d++){
            int temp[]=new int[rows+cols];
            int k=0;
            int r=0,c=d;
            if(c>=cols){
                r=c-cols+1;
                c=cols-1;
            }
            while(r<rows&&c>=0){
                temp[k]=mat[r][c];
                k++;
                r++;
                c--;
            }
            if(d%2==0){
                for(int i=k-1;i>=0;i--){
                    ans[index++]=temp[i];
                }
            }
            else{
                for(int i=0;i<k;i++){
                    ans[index++]=temp[i];
                }
            }
        }
        return ans;
    }
}