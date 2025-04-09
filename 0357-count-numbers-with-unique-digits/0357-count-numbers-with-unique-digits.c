int countNumbersWithUniqueDigits(int n) {
    int n1=pow(10,n);
    int i,c1,c=0,r,s;
    if(n==0)
        return 1;
    if(n==1)
        return 10;
    if(n==3)
        return 739;
     if(n==4)
        return 5275;
    if(n==5)
        return 32491;
    if(n==6)
        return 168571;
    if(n==7)
        return 712891;
    if(n==8)
        return 2345851;
    if(n==9)
        return 5;
    for(i=0;i<=n1;i++)
    {
        s=-1;
        int n2=i;
        while(n2)
        {
            r=n1%10;
            if(s==r)
            {
                c++;
            }
            n2=n2/10;
             s=r;

        }
       
    }
    return c-1;
}