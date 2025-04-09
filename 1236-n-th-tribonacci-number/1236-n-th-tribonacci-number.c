int tribonacci(int n) {
    int a,b,c,d,i;
    a=0;
    b=1;
    c=1;
    for(i=3;i<=n;i++)
    {
        d=a+b+c;
        a=b;
        b=c;
        c=d;
    }
    if(n==0)
        return a;
    else if(n==1)
        return a+b;
    else if(n==2)
        return a+c;
    else
        return d;
    
}