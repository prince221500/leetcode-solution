class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n=prices.length;

        long actualP=0;
        long[] profit=new long[n];    //original profit of each day

        for(int i=0;i<n;i++){
            profit[i] =(long)(strategy[i] * prices[i]);
            actualP += profit[i];
        }

        long ori=0;
        long mod=0;
        long maxG=0;    
    
        int i=0,j=0;

      
        while(j<n){
            ori += profit[j];

            
            if(j - i + 1 > k/2){
                mod += prices[j];
            }

            if(j-i+1 > k){
                ori -= profit[i];
                mod -= prices[i + k/2];
                i++;
            }

            
            if(j-i +1 ==k){
                maxG =Math.max(maxG, mod - ori);
            }

            j++;
        } 

        return actualP + maxG;
    }
}