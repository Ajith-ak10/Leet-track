// Last updated: 7/9/2026, 9:13:42 AM
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxh=0;
        while(left<right){
            int width=right-left;
            int minh=Math.min(height[left],height[right]);
            int curw=width*minh;
            maxh=Math.max(maxh,curw);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxh;
    }
}