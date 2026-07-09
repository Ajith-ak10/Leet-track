// Last updated: 7/9/2026, 9:13:41 AM
class Solution {
    public String intToRoman(int num) {
        int []val={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String s[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder r=new StringBuilder();
        for(int i=0;i<val.length;i++){
            while(num>=val[i]){
                r.append(s[i]);
                num-=val[i];
            }
        }
        return r.toString();
    }
}