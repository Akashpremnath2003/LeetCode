int repeatedNTimes(int* nums, int numsSize) {
    int n=numsSize;
    int i,j,a,c,f;
    for(i=0;i<n;i++)
    {
        f=1;
        for(j=0;j<i;j++)
        {
            if(nums[i]==nums[j])
            {
                f=0;
                break;
            }
        }
        if(f==1)
        {
            c=1;
            for(j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    c++;
                }
            }
            if(c>=2)
             a=nums[i];
        }
    }
    return a;
}