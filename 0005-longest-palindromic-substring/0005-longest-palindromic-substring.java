class Solution {
    String Myequ(StringBuffer s1)
    {
        char a[]=s1.toString().toCharArray();
        int l=0;
        int r=a.length-1;
        while(l<r)
        {
            char x=a[l];
            a[l]=a[r];
            a[r]=x;
            l++;
            r--;
        }
        return new String(a);
    }
    boolean isPalindrome(char a[],int l,int r)
    {

        while(l<r)
        {
            if(a[l]!=a[r])
                return false;
            l++;
            r--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        char a[]=s.toCharArray();
        String ans=new String();
        int m=0;
        for(int i=0;i<a.length;i++)
        {
            
            for(int j=i;j<a.length;j++)
            {
                 int len = j - i + 1;
                if (len > m && isPalindrome(a, i, j))
                {
                    ans=s.substring(i,j+1);
                    m=ans.length();
                }
            }
        }
        return ans.toString();
       
    }
}