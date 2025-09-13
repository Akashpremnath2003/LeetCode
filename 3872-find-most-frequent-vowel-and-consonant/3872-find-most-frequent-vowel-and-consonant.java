class Solution {
    public int maxFreqSum(String s) {
        int a[]=new int[256];
        int m1=0;
        int m2=0;
        for(char b:s.toCharArray())
        {
            a[b]++;

        }
        for(char b:s.toCharArray())
        {
            char k=Character.toLowerCase(b);
            if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u')
                m1=Math.max(a[b],m1);
            else
                m2=Math.max(a[b],m2);
        }
        return m1+m2;
    }
}