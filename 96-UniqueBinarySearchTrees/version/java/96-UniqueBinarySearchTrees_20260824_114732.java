// Last updated: 8/24/2026, 11:47:32 AM
1class Solution {
2    public String largestNumber(int[] nums) {
3        String arr[]=new String[nums.length];
4        for(int i=0;i<nums.length;i++){
5            arr[i]=String.valueOf(nums[i]);
6        }
7        Arrays.sort(arr,(a,b)->{
8            return (b+a).compareTo(a+b);
9            });
10        if(arr[0].equals("0")){
11            return "0";
12        }
13        StringBuilder res=new StringBuilder();
14        for(String x:arr){
15            res.append(x);
16        }
17        return res.toString();
18    }
19}