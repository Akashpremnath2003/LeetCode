int findNumbers(int* nums, int numsSize) {
    int i,c,c1=0,f,r;
    for(i=0;i<numsSize;i++)
    {
        f=0;
        c=0;
        while(nums[i]!=0)
        {
            c++;
            nums[i]=nums[i]/10;
        }
        if(c%2==0)
            f=1;
        if(f==1)
            c1++;
    }
    return c1;

}