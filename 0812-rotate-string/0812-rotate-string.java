class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
        char a[]=new char[s.length()];
     for(int i=0;i<s.length();i++)
     {
        for(int j=0;j<s.length();j++)
        {
            a[(i+j+1)%s.length()]=s.charAt(j);
            
        }
        String str=new String(a);
        System.out.println(str);
        if(str.equals(goal))
            return true;
     }   
     return false;
    
    }
}