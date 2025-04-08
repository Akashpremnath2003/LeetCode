int reverse(int x){
    long long s;
    int n=x;
    int r;
    s=0;
    while(n)
    {
        r=n%10;
        s=s*10+r;
        n=n/10;
        
    }
    if((pow(-2,31)<=s) && (s<=pow(2,31)-1))
        return s;
    
    return 0;

}