class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = accounts[0][0];
        for(int[] balance:accounts){
            int wealth = 0;
            for(int digit: balance){
                wealth = (wealth)+ digit;
            }
            if(wealth > maxWealth){
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}