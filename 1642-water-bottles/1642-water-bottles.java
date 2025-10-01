class Solution {
    public int numWaterBottles(int n1, int n2) {
        int s=n1;
        while(n1>=n2)
        {
            int r=n1%n2;
            int r1=n1-r;
            int r2=r1/n2;
            s+=r2;
            n1=r2+r;
        }
        return s;
    }
}