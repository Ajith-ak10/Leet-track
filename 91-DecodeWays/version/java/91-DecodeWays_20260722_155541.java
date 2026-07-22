// Last updated: 7/22/2026, 3:55:41 PM
1class Solution {
2    public int numDecodings(String s) {
3        if(s==null ||s.length()==0 || s.charAt(0)=='0'){
4            return 0;
5        }
6        int n=s.length();
7        int []d=new int[n+1];
8        d[0]=1;
9        d[1]=1;
10        for(int i=2;i<=s.length();i++){
11            int one=s.charAt(i-1)-'0';
12            int two=Integer.parseInt(s.substring(i-2,i));
13            if(one>=1){
14                d[i]+=d[i-1];
15            }
16            if(two>=10&&two<=26){
17                d[i]+=d[i-2];
18            }
19        }
20        return d[n];
21    }
22}