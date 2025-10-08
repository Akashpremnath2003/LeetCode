class Solution {
    public int[] successfulPairs(int[] spells, int[] a, long success) {
        List<Integer> list=new ArrayList<>();
        int c=0;
        Arrays.sort(a);
        int ans=-1;
        int m=0;
        for(int i:spells)
        {
            int l=0;
            int r=a.length-1;
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

            if(ans>=0)
                list.add(a.length-ans);
            else
                list.add(0);
                
        }
        int ans1[]=list.stream().mapToInt(Integer::intValue).toArray();
        return ans1;
    }
}