double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int n1=nums1Size;
    int n2=nums2Size;
    int i,j,x=n1+n2,c=0;
    int *a=malloc(x*sizeof(int));
    for(i=0;i<n1;i++)
    {
        a[c++]=nums1[i];
    }
    for(i=0;i<n2;i++)
    {
        a[c++]=nums2[i];
    }
    for(i=0;i<c-1;i++)
    {
        for(j=i+1;j<c;j++)
        {
            if(a[i]>a[j])
            {
                int c1=a[i];
                a[i]=a[j];
                a[j]=c1;
            }
        }
    }
   
    float k;
    if(c%2!=0)
    {
        int ans=c/2+0.5;
        k=a[ans];
    }
    else
    {
        int y=c/2;
        int z=y-1;
        k=(float)(a[z]+a[y])/2;

    }
return k;
}