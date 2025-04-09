/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* sortArrayByParityII(int* nums, int numsSize, int* returnSize) {
    *returnSize=numsSize;
    int n=numsSize,c;
    int *a=malloc(n*sizeof(int));
    c=0;
    for(int i=0;i<n;i++)
    {
        if(nums[i]%2==0)
        {
            a[c]=nums[i];
            c=c+2;
        }
    }
    int c1=1;
     for(int i=0;i<n;i++)
    {
        if(nums[i]%2!=0)
        {
            a[c1]=nums[i];
            c1=c1+2;
        }
    }
    return a;
}