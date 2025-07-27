class Solution {
    public int countHillValley(int[] nums) {
        int a[]=new int[nums.length];
        int c=0;
        for(int i=0;i<nums.length-1;i++)
        {
                 if(nums[i]==nums[i+1])
                    continue;
                a[c++]=nums[i];

        }
        a[c++]=nums[nums.length-1];
        int c1=0;
        for(int i=1;i<c-1;i++)
        {
            if(a[i]>a[i+1]&&a[i]>a[i-1])
                  c1++;
            if(a[i]<a[i+1]&&a[i]<a[i-1])
                    c1++;
        }
        return c1;
    }
}
