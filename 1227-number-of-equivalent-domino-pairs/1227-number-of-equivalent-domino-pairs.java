class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int c=0,val;
        int[] a=new int[100];
        for(int[] i : dominoes) 
        {
            if(i[0]<i[1])
            {
                val=i[0]*10+i[1];
            }
            else
            {
                val=i[1]*10+i[0];
            }
        c=c+a[val]++;
        } 

        return c; 
    }
}