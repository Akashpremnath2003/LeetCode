int smallestEqual(int* nums, int numsSize) {
    int n=numsSize;
    int i,a;
    for(i=0;i<n;i++)
    {
        if(i%10==nums[i])
            return i;
    }
   
    return -1;
}