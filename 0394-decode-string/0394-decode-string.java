class Solution {
    public String decodeString(String s) {
        char a[]=s.toCharArray();
        Stack<String> lis=new Stack<>();
        Stack<Integer> num=new Stack<>();
        int s1=0;
        String s2="";
        for(int i=0;i<a.length;i++)
        {
            if(Character.isDigit(a[i]))
            {
                s1=s1*10+(a[i]-'0');
            }
            else if(a[i]=='[')
            {
                num.add(s1);
                s1=0;
                lis.add(s2);
                s2="";
            }
            else if(a[i]==']')
            {
               int k=num.pop();
               String x=s2;
               s2="";
               for(int j=0;j<k;j++)
                s2+=x;
                s2=lis.pop()+s2; 
            }
            else
            {
                s2+=a[i];
            }
       }
       return s2;
    }
}