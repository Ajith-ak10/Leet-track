// Last updated: 7/9/2026, 9:11:56 AM
class Solution {
    public String toLowerCase(String s) {
        char ch[]=s.toCharArray();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(ch[i]!=Character.toLowerCase(ch[i])){
                ans+=Character.toLowerCase(ch[i]);
            }else{
                ans+=Character.toLowerCase(ch[i]);
            }
        }
        return ans;
    }
}