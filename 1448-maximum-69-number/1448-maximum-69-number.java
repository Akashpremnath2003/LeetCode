class Solution {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        char a[]=s.toCharArray();
        int d=num;
        for(int i=0;i<s.length();i++)
        {
           if(a[i]=='6')
            {
                a[i]='9';
                 String b=new String(a);
                d=Integer.valueOf(b);
                break;
            }
           
    
        }
        return d;
    }
}