// Last updated: 7/9/2026, 9:13:49 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            String sub="";
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(sub.contains(ch+"")){
                    break;
                }
                sub+=ch;
                max=Math.max(max,sub.length());
            }
        }
        return max;
    }
}