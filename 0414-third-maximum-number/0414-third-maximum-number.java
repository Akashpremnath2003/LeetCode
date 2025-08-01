class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new TreeSet<>(Comparator.reverseOrder());
        for(int i:nums)
            set.add(i);
         if(set.size()<3)
            return Arrays.stream(nums).max().getAsInt();
        int a[]=new int[set.size()];
        int c=0;
        for(int j:set)
            a[c++]=j;
        return a[2];
    }
}