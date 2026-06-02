//Find the missing number//
//using sum of natural numbers//
class Solution {
    public int missingNumber(int[] nums) {
        int sum=nums.length*(nums.length+1)/2;
        int arrSum=0;
        for(int i=0;i<nums.length;i++){
            arrSum=arrSum+nums[i];
        }
        return sum-arrSum;

    }
}
