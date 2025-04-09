/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* intersection(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize) {
    int n1=nums1Size;
    int n2=nums2Size;
    int *a=malloc(1000*sizeof(int));
    int *b=malloc(1000*sizeof(int));
    int i,j,a1[n2],c=0,f,c1=0;
    for(i=0;i<n2;i++)
    {
        f=1;
        for(j=0;j<i;j++)
        {
            if(nums2[i]==nums2[j])
            {
                f=0;
                break;
            }
        }
        if(f==1)
        {
            a1[c++]=nums2[i];
        }
    }
    int x=c;
    c=0;
     for(i=0;i<n1;i++)
    {
        f=1;
        for(j=0;j<i;j++)
        {
            if(nums1[i]==nums1[j])
            {
                f=0;
                break;
            }
        }
        if(f==1)
        {
            b[c++]=nums1[i];
        }
    }
    for(i=0;i<c;i++)
    {
        printf("%d\t",b[i]);
      
    }
    for(i=0;i<x;i++)
    {
        printf("\n%d\t",a1[i]);
    }
    for(i=0;i<c;i++)
    {
        for(j=0;j<x;j++)
        {
            if(b[i]==a1[j])
            {
                a[c1++]=b[i];
            }
        }
    }
    *returnSize=c1;
    return a;
    
}