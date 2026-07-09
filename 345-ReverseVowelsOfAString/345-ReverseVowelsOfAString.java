// Last updated: 7/9/2026, 9:12:25 AM
class Solution {
    public String reverseVowels(String s) {
        char[] a=s.toCharArray();
        int l=0,r=a.length-1;
        while(l<r){
            while(l<r&& !isVowel(a[l])){
                l++;
            }
            while(l<r&& !isVowel(a[r])){
                r--;
            }
            char temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
        return new String(a);
    }
    
    public boolean isVowel(char c){
            return "AEIOUaeiou".indexOf(c)!=-1;
    }
    
}