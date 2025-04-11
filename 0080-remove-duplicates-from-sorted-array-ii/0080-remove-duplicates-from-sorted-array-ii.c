int removeDuplicates(int* nums, int numsSize) {
    int n=numsSize;
    int i,c,j,a[n],c1=0;
    for(i=0;i<n;i++)
    {
        c=0;
        for(j=i;j<n;j++)
        {
            if(nums[i]==nums[j])
            {
                c++;
            }
        }
        if(c<3)
        {
            a[c1++]=nums[i];
        }
    }
    for(i=0;i<c1;i++)
    {
        nums[i]=a[i];
    }
    return c1;
}