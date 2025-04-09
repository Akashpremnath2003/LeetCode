int missingNumber(int* nums, int numsSize) {
    int n=numsSize,i,s1,s2;
    s1=0;
    for(i=0;i<n;i++)
        s1=s1+nums[i];
    s2=(n+1)*((n+1)-1)/2;
    return abs(s1-s2);
}