class Solution {
    public String sortVowels(String s) {
        char a[]=s.toCharArray();
        List<Character> c=new ArrayList<>();
        for(char k:a)
        {
            if(k=='a'||k=='A'||k=='e'||k=='E'||k=='i'||k=='I'||k=='o'||k=='O'||k=='u'||k=='U')
            c.add(k);
        }
        char b[]=new char[c.size()];
        int c1=0;
        for(char x:c)
            b[c1++]=x;
        Arrays.sort(b);
        c1=0;
        for(int i=0;i<s.length();i++)
        {
            if(a[i]=='a'||a[i]=='A'||a[i]=='e'||a[i]=='E'||a[i]=='i'||a[i]=='I'||a[i]=='o'||a[i]=='O'||a[i]=='u'||a[i]=='U')
            a[i]=b[c1++];
        }
        String ans=new String(a);
        return ans;
    }
}