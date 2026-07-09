// Last updated: 7/9/2026, 9:12:44 AM
class Solution {
    public int countPrimes(int n) {
        int c=0;
        int p[]=new int[n];
        for(int i=2;i<n;i++){
            p[i]=1;
        }
        for(int i=2;i*i<n;i++){
            if(p[i]==1){
                for(int j=i*i;j<n;j+=i){
                    p[j]=0;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(p[i]==1){
                c++;
            }
        }
        return c;
    }
}