bool isHappy(int n) {
long s,i,r,a;
for(i=0;i<n;i++)
{
    s=0;
    while(n)
    {
        r=n%10;
        s=s+r*r;
        n=n/10;
    }
    if(s==1)
    {
        return 1;
        break;
    }
    n=s;
}
    return 0;  
}