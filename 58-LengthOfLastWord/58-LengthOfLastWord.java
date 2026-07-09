// Last updated: 7/9/2026, 9:13:19 AM
class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            c++;
        }
        return c;
    }
}