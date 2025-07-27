class Solution {
    public boolean judgeSquareSum(int c) {
        long l=0,r=(int)Math.sqrt(c);
        while(l<=r)
        {
            if(l*l+r*r==c)
                return true;
            else if(l*l+r*r<c)
                l++;
            else
                r--;
        }
        return false;
    }
}