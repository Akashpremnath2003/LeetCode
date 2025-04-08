int removeDuplicates(int* nums, int numsSize) {
     int n=numsSize,i,j,f,c;
    c=0;
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
        nums[c++]=nums[i];
    
}
return c;
}