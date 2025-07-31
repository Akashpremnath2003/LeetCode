class Solution {
    public void rotate(int[] nums, int k) {
        List<Integer> b=new ArrayList<>();
        for(int i:nums)
            b.add(i);
        Collections.rotate(b,k);
        int c=0;
    for(int j:b)
        nums[c++]=j;
        
    }
}