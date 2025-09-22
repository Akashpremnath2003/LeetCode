class Solution {
    public int maxFrequencyElements(int[] nums) {
        List<Integer> l=Arrays.stream(nums).boxed().toList();
        Set<Integer> s=new HashSet<>(l);
        int m=Integer.MIN_VALUE;
        int a[]=new int[s.size()];
        int c=0;
        for(int i:s)
        {
            int k=Collections.frequency(l,i);
            m=Math.max(k,m);
            a[c++]=k;
        }
        final int k=m;
        long l1=Arrays.stream(a).filter(x->x==k).count();
        return (int)l1*k;
    }
}