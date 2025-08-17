class Solution {
    public int countPrefixes(String[] words, String s) {
        int c=0;
        for(String ss: words)
        {
            if(s.startsWith(ss))
                c++;
        }
        return c;
    }
}