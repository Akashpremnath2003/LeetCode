int search(int* nums, int numsSize, int target) {
    int n=numsSize;
    int i,a;
    for(i=0;i<n;i++)
    {
        a=-1;
        if(nums[i]==target)
        {
            a=i;
            break;
        }
    }
  printf("%d",a);
  return a;

}