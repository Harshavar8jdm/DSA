class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        int maxCapacity = 0;
        int totalCost = 0;
        int totalCapacity = 0;

        for (int i = 0; i < costs.length; i++) {
            if (costs[i] < budget) {
                maxCapacity = Math.max(maxCapacity, capacity[i]);
            }
        }

        for(int i = 0; i<costs.length; i++){
            for(int j = 0; j<costs.length; j++){
                if(j == i)
                    continue;
                totalCost = costs[i] + costs[j];
                totalCapacity  = capacity[i] + capacity[j];
                if(totalCost < budget){
                    maxCapacity = Math.max(totalCapacity, maxCapacity);
                }
            }
        }
        return maxCapacity;
    }
}