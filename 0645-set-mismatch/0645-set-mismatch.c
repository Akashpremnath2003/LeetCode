/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findErrorNums(int* nums, int numsSize, int* returnSize) {
    int n=numsSize;
    int i,j,a[n],b[n],c,c1=0,f,y;
    int *d=malloc(100*sizeof(int));
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
            a[c1++]=nums[i];
            c=1;
            for(j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                c++;
                }
            }
           if(c>=2)
           {
            y=nums[i];
           }
        }
    }
    for(i=0;i<c1;i++)
    {
        printf("%d\t%d\n",a[i],b[i]);
    }
    
    int s=0,x;
    for(i=0;i<c1;i++)
    {
        s=s+a[i];
    }
    int s1=n*(n+1)/2;
    x=abs(s-s1);
    d[0]=y;
    d[1]=x;
    *returnSize=2;
    return d;
}