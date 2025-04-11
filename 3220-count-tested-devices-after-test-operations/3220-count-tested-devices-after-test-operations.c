int countTestedDevices(int* nums, int batteryPercentagesSize) {
    int n=batteryPercentagesSize;
    int i,j;
    for(i=0;i<n-1;i++)
    {
        if(nums[i]>0)
        {
            for(j=i+1;j<n;j++)
            {
                nums[j]=nums[j]-1;
            }
        }
    } 
    int c=0;
     for(i=0;i<n;i++)
    {
        if(nums[i]>0)
            c++;
    }  
    return c;
}