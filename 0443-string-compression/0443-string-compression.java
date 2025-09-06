class Solution {
    public int compress(char[] a) {
        int c=1;
        String s="";
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                s=s+a[i];
                if(c!=1)
                    s=s+c;
                c=1;
            }
            else
            {
                c++;
            }

        }
        s=s+a[a.length-1];
        if(c!=1)
        s=s+c;
        int j=0;
        for(int i=0;i<s.length();i++)
            a[i]=s.charAt(i);
        System.out.println(Arrays.toString(a));
        return s.length();
    }
}