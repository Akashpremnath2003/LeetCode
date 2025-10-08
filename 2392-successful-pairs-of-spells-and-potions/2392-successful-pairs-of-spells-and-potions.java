class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        List<Integer> list=new ArrayList<>();
        int c=0;
        for(int i:spells)
        {
            c=0;
            for(int j:potions)
            {
                long x=(long)i*j;
                if(x>=success)
                    c++;
            }
            list.add(c);
        }
        int ans[]=list.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}