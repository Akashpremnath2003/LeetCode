int smallestEqual(int* nums, int numsSize) {
    int n=numsSize;
    int i,a,b[n],c=0;
    for(i=0;i<n;i++)
    {
        a=i%10;
        if(a==nums[i])
        {
            b[c++]=i;
        }
    }   
    if(c==0)
    {
        return -1;
    }
    int s=b[0];
    for(i=0;i<c;i++)
    {
        if(b[i]<s)
            s=b[i];
    }
    return s;
}