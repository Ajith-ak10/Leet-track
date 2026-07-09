// Last updated: 7/9/2026, 9:12:23 AM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int c[]=new int[128];
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            c[ch - 'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            c[ch - 'a']--;
            if(c[ch - 'a']<0){
                return false;
            }
        }
        return true;
    }
}