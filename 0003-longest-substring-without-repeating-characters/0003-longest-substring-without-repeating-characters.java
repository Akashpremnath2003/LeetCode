class Solution {
    public int lengthOfLongestSubstring(String s) {
        int s1=0;
        int m=0;
        int a[]=new int[256];
        for(int i=0;i<s.length();i++)
        {
            int a1=s.charAt(i);
            if(a[a1]>s1)
            {
                s1=a[a1];
            }
            a[a1]=i+1;
            m=Math.max(m,i+1-s1);
        }
        return m;
    }
}