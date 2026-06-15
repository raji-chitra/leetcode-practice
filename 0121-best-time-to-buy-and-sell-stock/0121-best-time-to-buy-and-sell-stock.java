class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int newprofit;
        int minprice=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<minprice)
            {
                minprice=prices[i];

            }
            else{
                newprofit=prices[i]-minprice;
            
            if(newprofit>profit)
            {
                profit = newprofit;
            }
            }
        }
        
        return profit;


        
    
}
}