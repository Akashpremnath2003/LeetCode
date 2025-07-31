class Solution {
    public boolean detectCapitalUse(String word) {
       
        String a=word.toUpperCase();
         String b=word.toLowerCase();
         String s="";
         String s1="";
         for(int i=1;i<word.length();i++)
         {
                s=s+word.charAt(i);
                s1=s1+word.charAt(i);
         }
         s1=s1.toLowerCase();
        if(a.equals(word))
            return true;
        else if(b.equals(word))
            return true;
        else 
        System.out.println(a.charAt(0)+" "+word.charAt(0)+" "+s+" "+s1);
            if(a.charAt(0)==word.charAt(0)&&s1.equals(s))
            {
                return true;
            }
    return false;
    }
}