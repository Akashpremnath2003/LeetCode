class Solution {
    public String reverseOnlyLetters(String s) {
        char a[]=s.toCharArray();
        char x[]=new char[s.length()];
        char y[]=new char[s.length()];
        int c=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(Character.isLetter(a[i]))
                x[c++]=a[i];

        }  
        c=0;
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(!Character.isLetter(s.charAt(i)))
                y[c++]=s.charAt(i);
            else
                y[c++]=x[j++];

    
        } 
        String b="";
        for(char i:y)
            b=b+i;
         
    
        return b;
    }
}