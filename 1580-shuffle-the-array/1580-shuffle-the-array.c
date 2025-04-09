

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* shuffle(int* nums, int numsSize, int n, int* returnSize){
    *returnSize=numsSize;
    int n1=numsSize;
    int *a=malloc(10000*sizeof(int));
    int i,j,a1[n1],c=0,c1;
    for(i=0;i<n1;i++)
    {
        a[c]=nums[i];
        c+=2;
    }
    c1=1;
    for(i=n;i<n1;i++)
    {
        a[c1]=nums[i];
        c1+=2;
    }
return a;

}