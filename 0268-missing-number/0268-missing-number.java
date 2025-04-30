class Solution {
    public int missingNumber(int[] nums) {
    int s1=0,s2;
    int n=nums.length;
    for(int i=0;i<n;i++)
        s1=s1+nums[i];
    s2=(n+1)*((n+1)-1)/2;
    return Math.abs(s1-s2);
    }
}