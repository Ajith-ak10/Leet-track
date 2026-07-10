// Last updated: 7/10/2026, 4:21:19 PM
1class Solution {
2    public String longestPalindrome(String s) {
3        if (s.length()<=1)
4            return s;
5        int st=0,maxlen=1;
6        for(int i=0;i<s.length();i++){
7            int l=i,r=i;
8            while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
9                if(r-l+1>maxlen){
10                    st=l;
11                    maxlen=r-l+1;
12                }
13                l--;
14                r++;
15            }
16            l=i;r=i+1;
17            while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
18                if(r-l+1>maxlen){
19                    st=l;
20                    maxlen=r-l+1;
21                }
22                l--;
23                r++;
24            }
25        }
26        return s.substring(st,st+maxlen);
27    }
28}