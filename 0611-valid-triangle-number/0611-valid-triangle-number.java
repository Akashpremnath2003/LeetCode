class Solution {
    static int[] removeZero(int nums[])
    {
         List<Integer> list=new ArrayList<>();
        for(int i:nums)
            if(i!=0)
                list.add(i);
            return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public int triangleNumber(int[] nums) {
        nums=removeZero(nums);
        Arrays.sort(nums);
        int c=0;
        System.out.println(nums.length);
        for(int i=0;i<nums.length-1;i++)
            for(int j=i+1;j<nums.length-1;j++)
                for(int k=j+1;k<nums.length;k++)
                    if(nums[i]+nums[j]>nums[k])
                        c++;
                        
    return c;
    }
}