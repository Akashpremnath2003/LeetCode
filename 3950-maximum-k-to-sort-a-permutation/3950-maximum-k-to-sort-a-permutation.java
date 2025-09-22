class Solution {
    public int sortPermutation(int[] nums) {
        int s=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)
                s=s&nums[i];
        }
        if(s==-1)
            return 0;
        return s;
    }
}