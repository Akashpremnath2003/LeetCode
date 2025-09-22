int maxFrequencyElements(int* nums, int numsSize) {
    int n=numsSize;
    int i,j,a[n],b[n],c1=0,f,c,l;
    for(i=0;i<n;i++)
    {
        f=0;
        for(j=0;j<i;j++)
        {
            if(nums[i]==nums[j])
            {
                f=1;
                break;
            }
        }
        if(f==0)
        {
            b[c1]=nums[i];
            c=1;
            for(j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    c++;
                }
            }
            a[c1++]=c;

        }
    }
    l=a[0];
    for(i=0;i<c1;i++)
    {
        if(a[i]>l)
            l=a[i];
    }
    c=0;
    for(i=0;i<c1;i++)
    {
        if(l==a[i])
            c++;
    }
    int s=0;
    for(i=0;i<c;i++)
    {
        s=s+l;
    }
    return s;
}