// Last updated: 7/9/2026, 9:11:50 AM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int l=0,r=image[i].length-1;
            while(l<=r){
                int temp=image[i][l];
                image[i][l]=image[i][r];
                image[i][r]=temp;
                image[i][l]^=1;
                if(l!=r){
                    image[i][r]^=1;
                }
                l++;
                r--;
            }
        }
        return image;
    }
}