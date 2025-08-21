class Solution {
    public String decodeString(String s) {
        Stack<Integer> in=new Stack<>();
        Stack<String> st=new Stack<>();
        int sum=0;
        String s1="";
        for(char j:s.toCharArray())
        {
            if(Character.isDigit(j))
            {
                sum=(sum*10)+(j-'0');
            }
            else if(j=='[')
            {
                in.push(sum);
                sum=0;
                st.push(s1);
                s1="";
            }
            else if(j==']')
            {
                int k=in.pop();
                String ans=s1;
                s1="";
                for(int i=0;i<k;i++)
                {
                    s1+=ans;
                }
                s1=st.pop()+s1;

            }
            else
            {
                s1=s1+j;
            }

        }
        return s1;
    }
}