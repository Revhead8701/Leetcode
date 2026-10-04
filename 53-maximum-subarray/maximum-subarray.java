class Solution {
    public int maxSubArray(int[] nums) {
       int l = 0;
       int sum = 0;
       int max = Integer.MIN_VALUE;

       while(l < nums.length){
        if(sum < 0){
            sum = 0;
        }
        sum += nums[l];
        
        max = Math.max(sum,max);
        l++;
       }
       return max;
    }
}