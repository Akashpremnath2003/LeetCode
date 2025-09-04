class Solution {
    public int findMaxK(int[] nums) {
    List<Integer> a1=new ArrayList<>();
    List<Integer> a2=new ArrayList<>();
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]<0)
            a1.add(Math.abs(nums[i]));
        else
            a2.add(nums[i]);
    }
    List<Integer> ans=new ArrayList<>();
    int m=-1;
    for(int i:a1)
        for(int j:a2)
            if(i==j)
                m=Math.max(m,i);
    return m;
    }
}