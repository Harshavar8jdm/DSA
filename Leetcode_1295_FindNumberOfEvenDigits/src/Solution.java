class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        int digitCount = 0;
        int temp = 0;

        for(int num:nums){
            temp = num;
            while (temp > 0) {
                digitCount++;
                temp /= 10;
            }
            if(digitCount%2==0){

                evenCount++;
            }
            digitCount = 0;
        }
        return evenCount;


        /*for(int num: nums){
            String value = String.valueOf(num);
            if(value.length() % 2 == 0){
                evenCount++;
            }
        }*/




    }
}