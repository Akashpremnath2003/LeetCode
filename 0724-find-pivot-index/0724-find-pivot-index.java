class Solution {
    public int pivotIndex(int[] nums) {
        int s1,s2;
        for(int i=0;i<nums.length;i++)
        {
            s1=0;
            s2=0;
            for(int j=0;j<i;j++)
            {
                s1=s1+nums[j];
            }
            for(int k=i+1;k<nums.length;k++)
            {
                s2=s2+nums[k];
            }
            if(s1==s2)
                return i;

        }
        return -1;
    }
}