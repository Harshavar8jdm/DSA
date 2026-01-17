public class Solution {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] nextArr = {-1,-1};
            if(nums.length != 0){
                int start = 0;
                int end = nums.length -1;

                while(start <= end){
                    int mid = start + (end - start)/2;
                    if(target < nums[mid]){
                        end = mid - 1;
                    }

                    else if(target > nums[mid]){
                        start = mid + 1;
                    }
                    else{
                        nextArr[0] = mid;
                        end = mid - 1;
                    }
                }

                start = 0;
                end = nums.length - 1;
                while(start <= end){
                    int mid = start + (end - start)/2;
                    if(target > nums[mid]){
                        start = mid + 1;
                    }
                    else if(target < nums[mid]){
                        end = mid - 1;
                    }
                    else{
                        nextArr[1] = mid;
                        start = mid + 1;
                    }


                }
                return nextArr;
            }

            else{
                return nextArr;
            }


        }


    }
}
