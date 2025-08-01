class Solution {
    public int maxProfit(int[] prices) {
       int m=Integer.MAX_VALUE;
       int a=0;
       for(int i=0;i<prices.length;i++)
       {
        if(prices[i]<m)
        {
            m=prices[i];
        }
        if(prices[i]>m)
        {
            int s=prices[i]-m;

            if(s>a)
                a=s;
        }
       }
       return a;
    }
}