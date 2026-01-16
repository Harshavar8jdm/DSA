class Solution {
    public boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;
        while(start<=end){
            long mid = start + (end - start)/2;
            if(num < (mid*mid)){
                end = mid - 1;
            }
            else if(num > (mid * mid)){
                start = mid + 1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}