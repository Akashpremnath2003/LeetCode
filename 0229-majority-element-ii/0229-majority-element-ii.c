/** 
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* majorityElement(int* nums, int numsSize, int* returnSize) {
    int n=numsSize;
    int i,j,a[n],b[n],c,c1=0,f;
    int *a1=malloc(100*sizeof(int));
    for(i=0;i<n;i++)
    {
        f=1;
        for(j=0;j<i;j++)
        {
            if(nums[i]==nums[j])
            {
                f=0;
                break; 
            }
        }
        if(f==1)
        {
            b[c1]=nums[i];
            c=1;
            for(j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    c++;
                }
            }
            a[c1++]=c;
        }
    }
    int c2=0;
    for(i=0;i<c1;i++)
    {
        if(a[i]>n/3)
            a1[c2++]=b[i];
    }
    *returnSize=c2;
    return a1;
   }