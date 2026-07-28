// Last updated: 7/28/2026, 4:22:26 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n=prices.length;
4        int b=-prices[0];
5        int s=0;
6        int c=0;
7        for(int i=0;i<n;i++){
8            int ob=b;
9            int os=s;
10            int oc=c;
11            b=oc-prices[i];
12            if(ob>b){
13                b=ob;
14            }
15            s=ob+prices[i];
16            if(os>s){
17                s=os;
18            }
19            c=os;
20        }
21        if(s>c){
22            return s;
23        }
24        return c;
25    }
26}