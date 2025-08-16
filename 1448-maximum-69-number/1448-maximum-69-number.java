class Solution {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        char a[]=s.toCharArray();
        System.out.println(s);
        int m=Integer.MIN_VALUE;
        int d;
        for(int i=0;i<s.length();i++)
        {
           if(a[i]=='9')
            {
                a[i]='6';
            }
             if(a[i]=='6')
            {
                a[i]='9';
            }
            String b=new String(a);
            d=Integer.valueOf(b);
            m=Math.max(m,d);
            a=s.toCharArray();
        }
        return m;
    }
}