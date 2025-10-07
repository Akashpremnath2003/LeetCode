class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        Set<Integer> s3=new HashSet<>();
        for(int i:nums1)
            s1.add(i);
        for(int i:nums2)
            s2.add(i);
        for(int i:nums1)
            if(s2.contains(i))
                s3.add(i);
        int ans[]=s3.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}