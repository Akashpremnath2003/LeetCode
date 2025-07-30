class Solution {
    public String finalString(String s) {
    int n=s.length();
    String b="";
    for(int i=0;i<n;i++)
    {
        if(s.charAt(i)=='i')
        {
             b=new StringBuffer(b).reverse().toString();
             continue;
        }
        b=b+s.charAt(i);

    }
    return b;
    }
}