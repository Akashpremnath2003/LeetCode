class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int m=Arrays.stream(nums).max().getAsInt();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==m)
                return i;
        }
        return 0;
    }
}