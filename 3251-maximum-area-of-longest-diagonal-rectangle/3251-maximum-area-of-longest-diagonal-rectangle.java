class Solution {
    public int areaOfMaxDiagonal(int[][] a) {
        double m=Double.MIN_VALUE;
        int s=0;
        int ans=1;
        int d=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                s=s+a[i][j]*a[i][j];
                ans*=a[i][j];

            }
            if((double)Math.sqrt(s)>m)
            {
                m=(double)Math.sqrt(s);
                d=ans;
            }
            else if((double)Math.sqrt(s)==m&&ans>d)
            {
                d=ans;
            }
            ans=1;
            s=0;
        }
        return d;
    }
}