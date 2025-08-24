class Solution {
    public int maxProfit(int[] prices) {
        

if(prices == null || prices.length <= 1)  {

    return 0;
}


        
        int buy = prices[0];
        
        int p= 0;
        
        for(int i = 1; i < prices.length; i++) {
           
            buy = Math.min(buy, prices[i]);
           
            p = Math.max(p, prices[i] - buy);
        }
        return p;  


    }
}