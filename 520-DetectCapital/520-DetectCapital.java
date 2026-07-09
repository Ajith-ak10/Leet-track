// Last updated: 7/9/2026, 9:12:07 AM
class Solution {
    public boolean detectCapitalUse(String word) {
        boolean upper=true;
        for(int i=0;i<word.length();i++){
            if(!Character.isUpperCase(word.charAt(i))){
                upper=false;
                break;
            }
        }
        if(upper){
            return true;
        }
        boolean lower=true;
        for(int i=0;i<word.length();i++){
            if(!Character.isLowerCase(word.charAt(i))){
                lower=false;
                break;
            }
        }
        if(lower){
            return true;
        }
        if(Character.isUpperCase(word.charAt(0))){
            for(int i=1;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}