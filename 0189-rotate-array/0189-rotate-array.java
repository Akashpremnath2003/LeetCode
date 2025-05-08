class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] a=new int[nums.length];
        int c=0;
        for(int i=nums.length-k-1;i>=0;i--)
        {
            a[c++]=nums[i];
        }
        for(int i=nums.length-1;i>=nums.length-k;i--)
        {
            a[c++]=nums[i];
        }
        c=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            nums[c++]=a[i];
        }
    }
}