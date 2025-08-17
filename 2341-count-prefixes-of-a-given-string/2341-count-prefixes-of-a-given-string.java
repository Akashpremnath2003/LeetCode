class Solution {
    public int countPrefixes(String[] words, String s) {
        // String a[]=new String[s.length()];
        // String s1="";
        // int c=0;
        // for(int i=0;i<s.length();i++)
        // {
        //     s1=s1+s.charAt(i);
        //     a[c++]=s1;
        // }
        // List<String> l=Arrays.asList(words);
        // for(String )
        // Arrays.stream(words).filter(t->t==)
        // return 0;
        int c=0;
        for(String ss: words)
        {
            if(s.startsWith(ss))
                c++;
        }
        return c;
    }
}