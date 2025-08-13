class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1)
            return true;
        for(int i=1;i<=Math.sqrt(n);i++)
            if(n==Math.pow(3,i))
                return true;
        return false;
    }
}