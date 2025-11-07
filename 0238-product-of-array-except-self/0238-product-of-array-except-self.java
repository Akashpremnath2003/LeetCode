class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int x=1;
        int y=1;
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=1;
        }
        for(int i=0;i<nums.length;i++)
        {
            ans[i]*=x;
            x*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            ans[i]*=y;
            y*=nums[i];
        }
        return ans;
    }
}