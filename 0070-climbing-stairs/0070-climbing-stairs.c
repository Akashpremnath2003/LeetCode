int climbStairs(int n) {
    if(n==1)
        return 1;
    int a,b,c,i;
     a=1;
     b=1;
     for(i=2;i<=n;i++)
     {
        c=a+b;
        a=b;
        b=c;
     }
     return c;
    
}