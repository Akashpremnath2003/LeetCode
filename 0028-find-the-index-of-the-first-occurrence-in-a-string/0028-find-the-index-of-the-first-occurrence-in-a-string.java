class Solution {
    public int strStr(String haystack, String needle) {
        String s="";
        String b="";
        int c=0;
        for(int i=0;i<haystack.length();i++)
        {
            b=b+haystack.charAt(i);
            s="";
            for(int j=i;j<haystack.length();j++)
            {
                s=s+haystack.charAt(j);
                if(s.equals(needle))
                {
                    return c;
                    
                }
            }
            c++;
        }
        return -1;
    }
}