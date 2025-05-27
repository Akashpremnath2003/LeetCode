class Solution {
    public boolean findSubarrays(int[] nums) {
        int c,c1=0;
        int a[]=new int[1000];
        int d=0;
        for(int i=0;i<nums.length-1;i++)
        {
            
              a[c1++]=nums[i]+nums[i+1];
             
        }
        for(int i=0;i<c1-1;i++)
        {
            for(int j=i+1;j<c1;j++)
            {
                if(a[i]==a[j])
                    return true;
            }
        }
        return false;
    }
}