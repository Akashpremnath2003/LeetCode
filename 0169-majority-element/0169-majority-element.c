int majorityElement(int* nums, int numsSize) {
    int ca=nums[0],c=1;
    for (int i=1;i<numsSize;i++) {
        if (nums[i]==ca)
            c++;
        else
            c--;
        
        if (c==0)
        {
            ca=nums[i];
            c=1;
        }
    }
return ca; 
}