int findLucky(int* arr, int arrSize) {
    int n=arrSize;
    int i,j,a[n],b[n],d1[n],c,c1=0,f,a1,l;
    for(i=0;i<n;i++)
    {
        f=1;
        for(j=0;j<i;j++)
        {
            if(arr[i]==arr[j])
            {
                f=0;
                break;
            }
        }
        if(f==1)
        {
            a[c1]=arr[i];
            c=1;
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                    c++;
            }
            b[c1++]=c;
        }
    }
    int y=0;
    for(i=0;i<c1;i++)
    {
        if(a[i]==b[i])
        {
            d1[y++]=a[i];
        }
    }
    if(y==0)
    {
        return -1;
    }
    l=d1[0];
    for(i=0;i<y;i++)
    {
        if(d1[i]>l)
            l=d1[i];
    }
    return l;
}