// Last updated: 7/9/2026, 9:11:29 AM
class Solution {
    public int largestAltitude(int[] gain) {
        int altitude=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
            altitude+=gain[i];
            if(altitude>max){
                max=altitude;
            }
        }
        return max;
    }
}