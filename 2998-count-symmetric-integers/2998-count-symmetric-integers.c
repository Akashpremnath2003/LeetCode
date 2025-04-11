int countSymmetricIntegers(int low, int high) {
    int i,j,c,n,r,c1=0,c2,d;
    for(i=low;i<=high;i++)
    {
        int n=i;
        int n1=i;
        c=(int)log10(n)+1;
        if(c%2==0)
        {
            c2=0;
            d=i;
            int x=c/2;
            int s1=0;
            int s2=0;
            while(d)
            {
                int r1=d%10;
                if(c2<x)
                    s1=s1+r1;
                else
                    s2=s2+r1;
                c2++;
                d=d/10;
            }
            if(s1==s2)
            {
                c1++;
            }
        }
    }
return c1;
}