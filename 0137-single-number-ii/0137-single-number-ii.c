int singleNumber(int* nums, int numsSize) {
    int i,j,c,m,f;
    for(i=0;i<numsSize;i++)
    {
        f=0;
        for(j=0;j<i;j++)
        {
            if(nums[i]==nums[j])
                f=1;
        }
        if(f==0)
        {
            c=0;
            for(j=i+1;j<numsSize;j++)
            {
              if(nums[i]==nums[j])
                 c++;
            }
            if(c==0)
             m=nums[i];
         }
    }
    return m;
}