int fillCups(int* amount, int amountSize) {
    int n=amountSize;
    int i,a;
    int l=amount[0];
    for(i=0;i<n;i++)
    {
        if(amount[i]>l)
            l=amount[i];
    }
    a=(amount[0]+amount[1]+amount[2]+1)/2;
    printf("%d\t%d\n",l,a);
    if(l>a)
        return l;
    else
        return a;
    return 0;

}