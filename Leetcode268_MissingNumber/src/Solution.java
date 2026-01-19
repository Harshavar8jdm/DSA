class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int missingNumber = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                missingNumber = i;
                return missingNumber;
            }
        }
        return nums.length;
    }
}