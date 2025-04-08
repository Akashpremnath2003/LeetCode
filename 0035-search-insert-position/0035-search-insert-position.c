int searchInsert(int* nums, int numsSize, int target) {
    int n,i,a,j;
    n=numsSize;
    for(i=0;i<n;i++)
    {
        if(nums[i]==target)
            a=i;
    }
    for(i=0;i<n;i++)
    {
    for(j=i+1;j<n;j++)
        if(target>nums[i] && target < nums[j])
            a=i+1;
    }
    if(target>nums[n-1])
        a=n;

    return a;
}