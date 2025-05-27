class Solution {
    public int[] buildArray(int[] nums) {
        int a[]=new int[nums.length];
        int c=0;
        for(int i:nums)
            a[c++]=nums[i];
    return a;

    }
}