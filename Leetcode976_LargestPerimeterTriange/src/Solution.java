class Solution {
    public int largestPerimeter(int[] nums) {
        boolean swapped;
        int maxPerimeter = 0;
        for(int i = 0; i < nums.length - 1; i++){
            swapped = false;
            for(int j = 1; j < nums.length - i; j++){
                if(nums[j] < nums[j -1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

        for(int j = 1; j < nums.length - 1; j++){
            if(nums[j - 1] + nums[j] > nums[j + 1]){
                int perimeter = nums[j - 1] + nums[j] + nums[j + 1];
                maxPerimeter = Math.max(maxPerimeter, perimeter);
            }
        }

        return maxPerimeter;
    }
}