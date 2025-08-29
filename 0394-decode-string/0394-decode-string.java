class Solution {
    public String decodeString(String s) {
        Stack<Integer> num=new Stack<>();
        Stack<String> str=new Stack<>();
        int s2=0;
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
                s2=(s2*10)+(s.charAt(i)-'0');
            else if(s.charAt(i)=='[')
            {
                num.push(s2);
                s2=0;
                str.push(s1);
                s1="";
            }
            else if(s.charAt(i)==']')
            {
                int k=num.pop();
                String x=s1;
                s1="";
                for(int j=0;j<k;j++)
                {
                    s1+=x;
                }
                s1=str.pop()+s1;

            }
            else
            {
                s1=s1+s.charAt(i);
            }
        }
        return s1.trim();
    }
}