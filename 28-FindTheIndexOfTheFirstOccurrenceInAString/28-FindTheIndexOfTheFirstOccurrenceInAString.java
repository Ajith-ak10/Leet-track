// Last updated: 7/9/2026, 9:13:32 AM
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        int h=haystack.length();
        int n=needle.length();
        for(int i=0;i<=h-n;i++){
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}