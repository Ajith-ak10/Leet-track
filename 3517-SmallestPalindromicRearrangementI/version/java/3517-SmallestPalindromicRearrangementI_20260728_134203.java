// Last updated: 7/28/2026, 1:42:03 PM
1class Solution {
2    public String smallestPalindrome(String s) {
3        int f[]=new int[26];
4        for(int i=0;i<s.length();i++){
5            f[s.charAt(i)-'a']++;
6        }
7        StringBuilder l=new StringBuilder();
8        String mid="";
9        for(int i=0;i<26;i++){
10            for(int j=0;j<(f[i]/2);j++){
11                l.append((char)(i + 'a'));
12            }
13            if(f[i]%2==1){
14                mid=String.valueOf((char)(i + 'a'));
15            }
16        }
17        String r=l.reverse().toString();
18        l.reverse();
19        return l.toString()+mid+r;
20    }
21}