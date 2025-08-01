class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int m=0;
        for(int i=0;i<nums.length-1;i++)
        {
            int s=nums[i+1]-nums[i];
            m=Math.max(m,s);

        }
        return m;

    }
}