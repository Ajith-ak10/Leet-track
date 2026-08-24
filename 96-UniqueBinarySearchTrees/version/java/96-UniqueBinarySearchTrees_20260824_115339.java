// Last updated: 8/24/2026, 11:53:39 AM
1class Solution {
2    public boolean checkPerfectNumber(int num) {
3        int sum=0;
4        for(int i=1;i<num;i++){
5            if(num%i==0){
6                sum+=i;
7            }
8        }
9        return num == sum;
10    }
11}