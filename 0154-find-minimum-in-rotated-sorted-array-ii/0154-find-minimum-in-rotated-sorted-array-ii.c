int findMin(int* nums, int numsSize) {
     int n=numsSize;
    int s=nums[0];
    for(int i=0;i<n;i++)
    {
        if(nums[i]<s)
            s=nums[i];
    }
return s;
}