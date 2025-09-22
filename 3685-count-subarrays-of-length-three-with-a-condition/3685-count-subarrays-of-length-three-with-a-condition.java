class Solution {
    public int countSubarrays(int[] a) {
        int c=0;
       for(int i=0;i<a.length-2;i++)
       {
        if((a[i]+a[i+2])*2==a[i+1])
            c++;
       } 
       return c;
    }
}