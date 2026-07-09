// Last updated: 7/9/2026, 9:13:01 AM
class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        if(s.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}