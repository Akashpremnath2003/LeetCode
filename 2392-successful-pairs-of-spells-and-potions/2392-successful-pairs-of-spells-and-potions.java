class Solution {
    public int[] successfulPairs(int[] spells, int[] a, long success) {
        List<Integer> li=new ArrayList<>();
        Arrays.sort(a);
         int m=-1;
         int ans=-1;
        for(int i:spells)
        {
            int l=0;
            int r=a.length-1;
            m=-1;
            ans=-1;
            while(l<=r)
            {
                m=(l+r)/2;
                if((long)a[m]*i>=success)
                {
                    ans=m;
                    r=m-1;
                }
                else
                {
                    l=m+1;
                }
            }
            if(ans!=-1)
                li.add(a.length-ans);
            else
                li.add(0);
        }
        return li.stream().mapToInt(Integer::intValue).toArray();
    }
}