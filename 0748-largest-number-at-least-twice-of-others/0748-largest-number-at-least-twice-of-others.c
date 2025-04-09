int dominantIndex(int* nums, int numsSize) {
    int n=numsSize;
    int l=nums[0];
    int i,a,sl,b;
    for(i=0;i<n;i++)
    {
        if(nums[i]>l)
        {
            l=nums[i];
        }
    }
    for(i=0;i<n;i++)
    {
        if(nums[i]<l)
        {
            sl=nums[i];
            break;
        }        
    }
    for(i=0;i<n;i++)
    {
        if(nums[i]>sl&&nums[i]<l)
            sl=nums[i];
    }
    for(i=0;i<n;i++)
    {
        if(l==nums[i])
        {
            a=i;
            break;
        }
    }
    if(l>=sl*2)
        b=a;
    else
        b=-1;
return b;
}