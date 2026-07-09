// Last updated: 7/9/2026, 9:13:21 AM
class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(intervals[i][0]>intervals[j][0]){
                    int temp1=intervals[i][0];
                    int temp2=intervals[i][1];
                    intervals[i][0]=intervals[j][0];
                    intervals[i][1]=intervals[j][1];
                    intervals[j][0]=temp1;
                    intervals[j][1]=temp2;
                }
            }
        }
        int k=0;
        int st=intervals[0][0];
        int ed=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=ed){
                if(intervals[i][1]>ed){
                    ed=intervals[i][1];
                }
            }
            else{
                intervals[k][0]=st;
                intervals[k][1]=ed;
                k++;
                st=intervals[i][0];
                ed=intervals[i][1];
            }
        }
        intervals[k][0]=st;
        intervals[k][1]=ed;
        k++;

        int[][] ans = new int[k][2];

        for(int i = 0; i < k; i++) {
            ans[i][0] = intervals[i][0];
            ans[i][1] = intervals[i][1];
        }

        return ans;
    }
}