class Solution {
    public String decodeString(String s) {
        Stack<Integer> setint=new Stack<>();
         Stack<String> schar=new Stack<>();
         int n=0;
         String s1="";
         for(char i:s.toCharArray())
         {
            if(Character.isDigit(i))
            {
                n=(n*10)+(i-'0');
            }
            else if(i=='[')
            {
                setint.push(n);
                n=0;
                schar.push(s1);
                s1="";
                
            }
            else if(i==']')
            {
                int ans=setint.pop();
                String t=s1;
                s1="";
                for(int j=0;j<ans;j++)
                {
                    s1+=t;
                }
                s1=schar.pop()+s1;
                
            }
            else
            {
                s1=s1+i;
            }
         }
         System.out.println(s1);
         return s1;
    }
}