void rotate(int* nums, int numsSize, int k) {
    int n=numsSize;
  while (k>=n) {
        k-=n;  
    }
    int a[n];
    for(int i=0;i<k;i++) 
    {
        a[i]=nums[n-k+i];
    }
    for (int i=0;i<n-k;i++) 
    {
        a[i+k]=nums[i];
    }
    for (int i=0;i<n;i++)
    {
        nums[i]=a[i];
    }
}
