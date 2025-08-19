class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c=0;
        long s=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                c++;
            }
            else
            {
                if(c!=0)
                {
                    s+=c*(c+1)/2;
                }
                c=0;
            }
        }   
        s+=c*(c+1)/2;
        return s;
    }
}