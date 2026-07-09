// Last updated: 7/9/2026, 9:12:06 AM
class Solution {
    public String reverseStr(String s, int k) {
        char ch[]=s.toCharArray();
        int i=0;
        while(i<s.length()){
            int st=i;
            int e=Math.min(i+k-1,s.length()-1);
            while(st<e){
                char temp=ch[st];
                ch[st]=ch[e];
                ch[e]=temp;
                st++;
                e--;
            }
            i=i+2*k;
        }
        return new String(ch);
    }
}