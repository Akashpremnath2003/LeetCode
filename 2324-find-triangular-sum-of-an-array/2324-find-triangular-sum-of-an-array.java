class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> list=new ArrayList<>(Arrays.stream(nums).boxed().toList());
        for(int j=0;j<nums.length;j++)
        {
        for(int i=0;i<list.size()-1-j;i++)
        {
            list.set(i,(list.get(i)+list.get(i+1))%10);
        }
        }
        return list.get(0);
    }
}