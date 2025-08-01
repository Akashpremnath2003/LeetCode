class Solution {
    public boolean checkDivisibility(int n) {
        int s1=0;
        int s2=1;
        int m=n;
        while(n!=0)
        {
            int r=n%10;
            s1=s1+r;
            s2=s2*r;
            n=n/10;
        }
       return m%(s1+s2)==0;
    }
}