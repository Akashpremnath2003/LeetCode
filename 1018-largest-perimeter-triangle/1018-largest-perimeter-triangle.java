class Solution {
    public int largestPerimeter(int[] nums) {
        List<Integer> l=Arrays.stream(nums).boxed().toList();
        ArrayList<Integer> list=new ArrayList<>(l);
        list.remove(Integer.valueOf(0));
        Collections.sort(list);
        System.out.println(list);
        int m=0;
        for(int i=0;i<list.size()-2;i++)
        {
            if(list.get(i)+list.get(i+1)>list.get(i+2))
                m=Math.max(m,list.get(i)+list.get(i+1)+list.get(i+2));
        }
        return m;

    }
}