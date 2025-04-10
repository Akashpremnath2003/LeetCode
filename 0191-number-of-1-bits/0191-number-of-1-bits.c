int hammingWeight(int n) {
    long long p,s,r;
    p=0;
    s=0;
    while(n)
    {
        r=n%2;
        if(r!=0)
        {
            s++;
        }
        
        n=n/2;
    }
   
    return s;
}