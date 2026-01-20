class Solution {
    public int[] runningSum(int[] nums) {
        int totalSum = 0;
        int[] runningSum = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            totalSum = totalSum + nums[i];
            runningSum[i] = totalSum;
        }
        return runningSum;
    }
}