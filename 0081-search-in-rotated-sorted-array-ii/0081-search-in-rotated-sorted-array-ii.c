bool search(int* nums, int numsSize, int target) {
    int n=numsSize,i,f;
    for(i=0;i<n;i++)
    {
        f=1;
        if(target==nums[i])
        {
            f=0;
            break;
        }
    }
    if(f==1)
        return 0;
    return 1;
    
}