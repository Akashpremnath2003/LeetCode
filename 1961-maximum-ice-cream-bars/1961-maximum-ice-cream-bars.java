class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c=0;
        for(int j:costs)
        {
            coins=coins-j;
            if(coins<0)
                break;
            c++;
        }
        return c;
    }
}