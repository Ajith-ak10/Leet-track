// Last updated: 7/9/2026, 9:12:43 AM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int rpS[]=new int[256];
        int rpT[]=new int[256];
        for(int i=0;i<s.length();i++){
            char charS=s.charAt(i);
            char charT=t.charAt(i);
            if (rpS[charS]!=rpT[charT]){
                return false;
            }
            rpS[charS]=i+1;
            rpT[charT]=i+1;
        }
        return true;
    }
}