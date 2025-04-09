bool isMonotonic(int* nums, int numsSize) {
    int n=numsSize,a,b,c=1,i;
    for(i=0;i<n-1;i++)
    {
        if(nums[i]<=nums[i+1])
            c++;
    }
    b=c;
    c=1;
    for(i=0;i<n-1;i++)
    {
        if(nums[i]>=nums[i+1])
            c++;
    }

    if(c==n||b==n)
    {
        a=1;
    }
    else
        {
            a=0;
        }
        return a;
}