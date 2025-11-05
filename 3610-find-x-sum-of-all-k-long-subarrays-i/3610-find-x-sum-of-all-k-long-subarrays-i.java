class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        Map<Integer,Integer> mp=new HashMap<>();
        int ans[]=new int[nums.length-k+1];
        int c=0;
        for(int j=0;j<nums.length-k+1;j++)
        {
            for(int i=j;i<j+k;i++)
                mp.merge(nums[i],1,(x1,y1)->x1+y1);
            List<Map.Entry<Integer,Integer>> li=new ArrayList<>(mp.entrySet());
            li.sort((a,b)->{
                if(!a.getValue().equals(b.getValue()))
                    return b.getValue()-a.getValue();
                return b.getKey()-a.getKey();
        });
            System.out.println(li);
            int s=0;
            for(int d=0;d<Math.min(x, li.size());d++)   
                s+=li.get(d).getValue()*li.get(d).getKey();
            ans[c++]=s;
            mp.clear();
        }
            return ans;
    }
}