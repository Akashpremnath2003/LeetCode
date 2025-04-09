int subtractProductAndSum(int n) {
    int s,s1,r;
    s=1;
    s1=0;
    while(n)
    {
        r=n%10;
        s=s*r;
        s1=s1+r;
        n=n/10;
    }
    int ans=s-s1;
    return ans;
    
}