// Last updated: 7/9/2026, 9:12:52 AM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans=0;
        for(int i=0;i<numbers.length;i++){
            int sum=0;
            for(int j=i+1;j<numbers.length;j++){
                sum=numbers[i]+numbers[j];
                if(sum==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{};
    }
}