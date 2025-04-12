int arrangeCoins(int n) {
    int c=n,i;
    for(i=1;i<=n;i++)
    {
        if(i>c)
            break;
        c-=i;
    }
    return i-1;
}