class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int current=0,j=i;
            while(j<n){
                current+=nums[j];
                if(current>=target){
                    res=Math.min(res,j-i+1);
                    break;
                }j++;
            }
        }return res==Integer.MAX_VALUE ?0:res;
    }
}