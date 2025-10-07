class Solution {
    boolean search(List<Character> a,char s)
    {
        for(char k:a)
            if(k==s)
                return true;
        return false;
    }

    public int lengthOfLongestSubstring(String s) {
        List<Character> li=new ArrayList<>();
        int l=0;
        int max=0;
        char a[]=s.toCharArray();
       for(int i=0;i<a.length;i++)
       {
        boolean x=search(li,a[i]);
        while(x)
        {
            System.out.println(li.remove(l));
            System.out.println(x);
            x=search(li,a[i]);

        }  
        li.add(a[i]);
        max=Math.max(max,li.size());
       }
       return max;
    }
}