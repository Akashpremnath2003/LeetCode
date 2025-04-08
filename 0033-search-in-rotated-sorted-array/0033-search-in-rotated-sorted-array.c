int search(int* nums, int numsSize, int target) {
     int n=numsSize;
 int i,a,f;
 for(i=0;i<n;i++)
 {
    if(target==nums[i])
    {
        a=i;
        break;
    }
    else
    {
        a=-1;
    }
 }   
return a;
}
