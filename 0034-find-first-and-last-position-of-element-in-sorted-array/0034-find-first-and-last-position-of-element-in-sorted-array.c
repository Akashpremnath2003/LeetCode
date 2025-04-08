/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* searchRange(int* nums, int numsSize, int target, int* returnSize) {
    int l=0;
    int r=numsSize-1;
    *returnSize=2;
    int *a=malloc(2*sizeof(int));
    int i,f,a1,a2;
    for(i=l;i<numsSize;i++)
    {
        if(nums[i]==target)
        {
            a1=i;
            f=1;
            break;
        }
        else
        {
            f=0;
        }
    }
    for(i=r;i>=0;i--)
    {
        if(nums[i]==target)
        {
            a2=i;
            f=1;
            break;
        }
       
    }
    if(f==1)
    {
        a[0]=a1;
        a[1]=a2;
    }
    else
    {
        a[0]=-1;
        a[1]=-1;
    }
return a;
}