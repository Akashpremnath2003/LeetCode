int maxProfit(int* prices, int pricesSize) {
    int s=0;
    for(int i=1;i<pricesSize;i++)
    {
        if(prices[i]>prices[i-1])
            s=s+prices[i]-prices[i-1];
    }
    return s;
}