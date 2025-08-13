class Solution {
    public boolean digitCount(String num) {
        char a[]=num.toCharArray();
        int c=0;
        for(int i=0;i<num.length();i++)
        {
            c=0;
            for(int j=0;j<num.length();j++)
            {
                int x=a[j]-'0';
                if(i==x)
                    c++;
            }
            int y=a[i]-'0';
            if(y!=c)
                return false;
        }
        return true;
    }
}