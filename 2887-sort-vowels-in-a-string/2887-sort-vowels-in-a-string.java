class Solution {
    public String sortVowels(String s) {
        char a[]=s.toCharArray();
        String s1="";
        for(char k:a)
        {
            if(k=='a'||k=='A'||k=='e'||k=='E'||k=='i'||k=='I'||k=='o'||k=='O'||k=='u'||k=='U')
            s1=s1+k;
        }
        char b[]=s1.toCharArray();
        Arrays.sort(b);
        int c1=0;
        for(int i=0;i<s.length();i++)
        {
            if(a[i]=='a'||a[i]=='A'||a[i]=='e'||a[i]=='E'||a[i]=='i'||a[i]=='I'||a[i]=='o'||a[i]=='O'||a[i]=='u'||a[i]=='U')
            a[i]=b[c1++];
        }
        String ans=new String(a);
        return ans;
    }
}