class Solution {
    public int wiggleMaxLength(int[] nums) {
        List<Integer> list=new ArrayList<>(); 
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]-nums[i+1]!=0)
            list.add(nums[i]-nums[i+1]);
        }
        System.out.println(list);
        if(list.size()==0)
            return 1;
        int c=list.size()+1;
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)>=0&&list.get(i+1)>=0)
                c--;
            else if(list.get(i)<0&&list.get(i+1)<0)
                c--;
        }
        return c;
    }
}