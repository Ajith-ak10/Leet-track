// Last updated: 7/9/2026, 9:13:39 AM
class Solution {
    public int romanToInt(String s) {
        int t=0;
        int prev=0;
        for(int i=s.length()-1;i>=0;i--){
            int c=0;
            switch(s.charAt(i)){
                case 'I'->c=1;
                case 'V'->c=5;
                case 'X'->c=10;
                case 'L'->c=50;
                case 'C'->c=100;
                case 'D'->c=500;
                case 'M'->c=1000;
            }
            if(c<prev){
                t-=c;
            }
            else{
                t+=c;
                prev=c;
            }
        }
        return t;
    }
}