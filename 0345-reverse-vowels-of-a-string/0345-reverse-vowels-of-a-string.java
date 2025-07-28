class Solution {
    public String reverseVowels(String s) {
        char a[]=s.toCharArray();
        char b[]=new char[s.length()];
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
                b[c++]=a[i];
        }
        int c1=0;
        char d[]=new char[c];
        for(int i=c-1;i>=0;i--)
        {
            d[c1++]=b[i];
        }
        int j=0;
        c1=0;
        for(int i=0;i<s.length();i++)
        {
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
                a[i]=d[c1++];
                
        }
        String ans="";
        for(int i=0;i<s.length();i++)
        {
                ans=ans+a[i];
                
        }
        return ans;
    }
}