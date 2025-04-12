bool canJump(int* nums, int numsSize) {
    int n=numsSize;
    int i=n-2;
    int n1=i+1;
    while(i>=0)
    {
        if((i+nums[i])>=n1)
            n1=i;
        i--;
           
    }
    if(n1==0)
        return 1;
    return 0;
}