int numIdenticalPairs(int* nums, int numsSize) {
    int i,j,c=0;;
    for(i=0;i<numsSize-1;i++)
    {
        for(j=i+1;j<numsSize;j++)
        {
            if(nums[i]==nums[j])
                c++;
        }
    }
    return c;
    
}