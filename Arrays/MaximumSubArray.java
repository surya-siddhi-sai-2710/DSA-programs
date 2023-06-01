/*
It is a leetcode problem Maximum SubArray
Here we are using Kadane's Algorithm to get the output in O(1)
Given an integer array nums, find the subarray with the largest sum, and return its sum.
Example:
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: The subarray [4,-1,2,1] has the largest sum 6.
    
*/
class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = nums[0];
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(sum > maxi)
                maxi = sum;
            if( sum < 0)
                sum = 0;
        }
        return maxi;
    }
}
