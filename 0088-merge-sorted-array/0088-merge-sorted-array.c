void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n) 
{
    int i,j,nums3[m+n],c=0;
    for(i=m;i<m+n;i++)
    {
        nums1[i]=nums2[c++];
    }
    for(i=0;i<m+n-1;i++)
    {
        for(j=i+1;j<n+m;j++)
        {
            if(nums1[i]>nums1[j])
            {
            int c1=nums1[i];
            nums1[i]=nums1[j];
            nums1[j]=c1;
            }
        }
    }

}