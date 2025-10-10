class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        TreeMap<Integer,Integer> ma=new TreeMap<>();
        for(int i:nums)
            if(ma.containsKey(i))
                ma.put(i,ma.get(i)+1);
            else
                ma.put(i,1);
        List<Integer> li=new ArrayList<>(ma.keySet());
        li.sort((x,y)->ma.get(y)-ma.get(x));
        System.out.println(li);
        int a[]=new int[k];
        int c=0;
        for(int i=0;i<k;i++)
            a[c++]=li.get(i);
      return a;
    }
}