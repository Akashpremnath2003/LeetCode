class Solution {
    public String largestGoodInteger(String num) {
        char a[]=num.toCharArray();
        int b[]=new int[num.length()];
        int c=0,c1=1;
        String s="";
        int m=Integer.MIN_VALUE;
        for(char i:a)
            b[c++]=i-'0';
        if(c==3)
        {
            if(b[0]==b[1]&&b[1]==b[2])
                return num;
        }
        for(int j=0;j<num.length()-1;j++)
        {
            if(b[j]==b[j+1])
            {
                c1++;
                if(c1>=3)
                {
                    m=Math.max(m,b[j]);
                }
            }
            else
            {
                
                
                c1=1;
            }
            
        }
        System.out.println(m);
        if(m!=Integer.MIN_VALUE)
            s=s+m+m+m;

        return s;
    }
}