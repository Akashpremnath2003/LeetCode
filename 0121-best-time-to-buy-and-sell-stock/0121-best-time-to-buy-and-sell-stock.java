class Solution {
    public int maxProfit(int[] prices) {
       int m=Integer.MAX_VALUE;
       int a=0;
       int i=0;
       while(i!=prices.length)
       {
        if(prices[i]<m)
        {
            m=prices[i];
        }
        if(prices[i]>m)
        {
            int s=Math.abs(m-prices[i]);
            System.out.println(s);
            if(s>a)
                a=s;
        }
        i++;
       }
       return a;
    }
}