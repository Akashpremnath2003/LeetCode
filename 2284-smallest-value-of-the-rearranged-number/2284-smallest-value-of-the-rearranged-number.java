class Solution {
    public long smallestNumber(long num) {
        String s=String.valueOf(num);
        char a[]=s.toCharArray();
        long c1=0;
        if(num>0)
        {
            Arrays.sort(a);
            for(int i=0;i<a.length;i++)
            {
            if(a[0]=='0')
            {
                char c=a[0];
                a[0]=a[i];
                a[i]=c;
            }
            }
             String ans=new String(a);
            c1=Long.valueOf(ans);
        }
        else
        {
             Arrays.sort(a);
            int l=0;
            int r=a.length-1;
            while(l<r)
            {
                if(a[l]!='-')
                {
                char c=a[l];
                a[l]=a[r];
                a[r]=c;
                l++;
                r--;
                }
                else
                {
                    l++;   
                }
            }
             String ans=new String(a);
            c1=Long.valueOf(ans);
        }
        return c1;
    }
}