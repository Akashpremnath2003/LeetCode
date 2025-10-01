class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> l1=Arrays.stream(nums1).boxed().toList();
        List<Integer> l2=Arrays.stream(nums2).boxed().toList();
        List<Integer> ans=new ArrayList<>();
        int x=-1;
        for(int i:l1)
        {
            
            for(int k=0;k<nums2.length;k++)
            {
                if(i==nums2[k])
                {
                    x=k;
                    break;
                }
            }
            System.out.println(x);
            if(x>=0)
            {
                int f=0;
                for(int j=x;j<nums2.length;j++)
                {
                    if(nums2[j]>i)
                    {
                        f=1;
                        ans.add(nums2[j]);
                        break;
                    }
                }
                if(f==0)
                    ans.add(-1);
            }
            else
            {
                ans.add(-1);
            }
        }
        int an[]=ans.stream().mapToInt(Integer::intValue).toArray();
        return an;
    }
}