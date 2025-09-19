class Solution {
    public String decodeString(String s) {
        int a[]=new int[100];
        String b[]=new String[100];
        char d[]=s.toCharArray();
        int x=0;
        int c=-1;
        int c1=-1;
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if(d[i]>='0'&&d[i]<='9')
                x=x*10+d[i]-'0';
            else if(d[i]=='[')
            {
                a[++c]=x;
                x=0;
                b[++c1]=str;
                str="";
            }
            else if(d[i]==']')
            {
                int n=a[c--];
                String t=str;
                str="";
                str=b[c1--]+t.repeat(n);
            }
            else
            {
                str=str+d[i];
            }
        }
        return str;
    }
}