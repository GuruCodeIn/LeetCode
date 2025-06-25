class Solution {
    public int minimumCost(int[] cost) {
        int temp,total=0, n=cost.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(cost[j]<cost[j+1]){
                    temp=cost[j];
                    cost[j]=cost[j+1];
                    cost[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(i%3!=2){
              total=total+cost[i];
            }
        }
        return total;
    }
}