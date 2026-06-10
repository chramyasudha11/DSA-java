class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long curSum=0;
        //first window
        for(int i=0;i<k;i++){
            curSum+=nums[i];
        }
        long maxSum=curSum;
        //sliding window
        for(int i=k;i<nums.length;i++){
            curSum+=nums[i]-nums[i-k];
            maxSum=Math.max(maxSum,curSum);
        }
        return (double)maxSum/k;
    }
}
