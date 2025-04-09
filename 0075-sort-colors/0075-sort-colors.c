void sortColors(int* nums, int numsSize) {
    int n=numsSize,i,j;
    for(i=0;i<n-1;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(nums[i]>nums[j])
            {
                int c=nums[i];
                nums[i]=nums[j];
                nums[j]=c;
            }
        }
    }
    
}