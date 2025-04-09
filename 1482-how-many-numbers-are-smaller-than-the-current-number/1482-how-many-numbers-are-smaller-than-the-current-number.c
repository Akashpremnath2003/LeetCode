/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* smallerNumbersThanCurrent(int* nums, int numsSize, int* returnSize) {
    int n=numsSize,i,j;
    *returnSize=n;
    int *a=malloc(n*sizeof(int));
    for(i=0;i<n;i++)
    {
        int c=0;
        for(j=0;j<n;j++)
        {
            if(nums[j]<nums[i])
                c++;
        }
        a[i]=c;
    }
    return a;
}